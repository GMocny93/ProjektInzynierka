package com.example.grzesiek.projektinzynierka.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.grzesiek.projektinzynierka.database.DatabaseHandler;
import com.example.grzesiek.projektinzynierka.domain.Weight;
import com.example.grzesiek.projektinzynierka.utils.Constansts;

import java.util.ArrayList;
import java.util.List;

public class WeightDAOimpl implements WeightDAO {
    private DatabaseHandler dbHandler;

    public WeightDAOimpl(DatabaseHandler dbHandler) {
        this.dbHandler = dbHandler;
    }

    @Override
    public void addWeight(Weight weight) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Constansts.WG_YEAR, weight.getYear());
        values.put(Constansts.WG_MONTH, weight.getMonth());
        values.put(Constansts.WG_DAY, weight.getDay());
        values.put(Constansts.WG_WEIGHT, weight.getWeight());
        db.insert(Constansts.TABLE_WEIGHT, null, values);
        db.close();
    }

    @Override
    public Weight getWeight(int id) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();
        Cursor cursor = db.query(Constansts.TABLE_WEIGHT, new String[]{Constansts.WG_ID, Constansts.WG_YEAR, Constansts.WG_MONTH, Constansts.WG_DAY, Constansts.WG_WEIGHT},
                Constansts.WG_ID + "=?", new String[] {String.valueOf(id)},
                null,null,null,null);
        if (cursor != null)
            cursor.moveToFirst();
        Weight weight = new Weight(Integer.parseInt(cursor.getString(0)),Integer.parseInt(cursor.getString(1)),
                Integer.parseInt(cursor.getString(2)), Integer.parseInt(cursor.getString(3)),
                Double.parseDouble(cursor.getString(4)));
        return weight;
    }

    @Override
    public List<Weight> getAllWeight() {
        List<Weight> weightList = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + Constansts.TABLE_WEIGHT;
        SQLiteDatabase db = dbHandler.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);
        if (cursor.moveToFirst()){
            do {
                Weight weight = new Weight();
                weight.setId(Integer.parseInt(cursor.getString(0)));
                weight.setYear(Integer.parseInt(cursor.getString(1)));
                weight.setMonth(Integer.parseInt(cursor.getString(2)));
                weight.setDay(Integer.parseInt(cursor.getString(3)));
                weight.setWeight(Double.parseDouble(cursor.getString(4)));
                weightList.add(weight);
            } while (cursor.moveToNext());
        }
        return weightList;
    }

    @Override
    public int updateWeight(Weight weight) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Constansts.WG_YEAR, weight.getYear());
        values.put(Constansts.WG_MONTH, weight.getMonth());
        values.put(Constansts.WG_DAY, weight.getDay());
        values.put(Constansts.WG_WEIGHT, weight.getWeight());

        return db.update(Constansts.TABLE_WEIGHT, values, Constansts.WG_ID + " = ?",
                new String[]{String.valueOf(weight.getId())});
    }

    @Override
    public void deleteWeight(Weight weight) {
        SQLiteDatabase db = dbHandler.getWritableDatabase();
        db.delete(Constansts.TABLE_WEIGHT, Constansts.WG_ID + " = ?",
                new String[] {String.valueOf(weight.getId())});
        db.close();
    }
}

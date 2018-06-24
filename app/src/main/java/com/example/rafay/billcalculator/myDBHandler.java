package com.example.rafay.billcalculator;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;


public class myDBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Data.db";
    public static final String TABLE_NAME = "Units";        //Table name
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_PREVIOUS = "previousUnits";
    public static final String COLUMN_NEXT = "nextUnits";

    public myDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT  " +
                        COLUMN_PREVIOUS  + " INTEGER   " +
                        COLUMN_NEXT + "   INTEGER  " + ");";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

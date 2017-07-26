package com.example.mymailbox;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by emilia on 7/26/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME="TestDB";
    public static final String TABLE_NAME = "Email";
    public static final String Col_1="ID";
    public static final String Col_2="Subject";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        //SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, Subject TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    /*public boolean InsertData(String subject){

        ContentValues content = new ContentValues();
        content.put(Col_2,subject);
        long result = db.insert(Table_Name,null,content);
        if(result == -1)
            return false;
        else
            return true;
    }*/
}

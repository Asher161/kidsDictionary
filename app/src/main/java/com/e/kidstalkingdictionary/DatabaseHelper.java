package com.e.kidstalkingdictionary;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="KidsDictionary.db";
    public static final String TABLE_NAME="Dictionary";
    public static final String COL1="ID";
    public static final String COL2="Word";
    public static final String COL3="Meaning";
    public static final String COL4="Description";
    public static final String COL5="Grade";
    public static final String COL6="Image";
    public static final String COL7="Recording";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE "+TABLE_NAME+"(COL1 PRIMARY KEY ASC AUTOINCREMENT, " +
                "                               COL2 TEXT, COL3 TEXT, COL4 TEXT, COL5 TEXT  )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean InsertData(String Word, String Meaning, String Description, String Grade) {
        SQLiteDatabase sqLiteDatabase =this.getWritableDatabase();
        ContentValues contentValues =new ContentValues();
        contentValues.put(COL2, Word);
        contentValues.put(COL3, Meaning);
        contentValues.put(COL4, Description);
        contentValues.put(COL5, Grade);

        long result = sqLiteDatabase.insert(TABLE_NAME, null, contentValues);
        if(result == -1)
            return  false;
        else
            return true;
    }
}

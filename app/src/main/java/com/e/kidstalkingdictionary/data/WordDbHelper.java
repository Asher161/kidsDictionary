package com.e.kidstalkingdictionary.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.e.kidstalkingdictionary.data.WordContract.WordEntry;

public class WordDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "KidDictionary.db";


    public WordDbHelper (Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_WORD_TABLE = "CREATE TABLE " + WordEntry.TABLE_NAME + " ("
                + WordEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + WordEntry.COLUMN_WORD + " TEXT NOT NULL, "
                + WordEntry.COLUMN_DISCRIPTION + " TEXT NOT NULL, "
                + WordEntry.COLUMN_GRADE + " INTEGER NOT NULL, "
                + WordEntry.COLUMN_MEANING + " TEXT NOT NULL );";

        db.execSQL(SQL_CREATE_WORD_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

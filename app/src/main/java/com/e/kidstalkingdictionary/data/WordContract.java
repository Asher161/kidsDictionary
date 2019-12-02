package com.e.kidstalkingdictionary.data;

import android.provider.BaseColumns;

public final class WordContract {

    private WordContract(){}

    public static final class WordEntry implements BaseColumns{

        public final static String TABLE_NAME = "Words";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_WORD = "Word";
        public final static String COLUMN_MEANING = "Meaning";
        public final static String COLUMN_DISCRIPTION = "Description";
        public final static String COLUMN_IMAGE = "Image";
        public final static String COLUMN_AUDIO = "Audio";
        public final static String COLUMN_GRADE = "Grade";

        public final static int GRADE_UNKNOWN = 0;
        public final static int GRADE_ONE = 1;
        public final static int GRADE_TWO = 2;
        public final static int GRADE_THREE = 3;
        public final static int GRADE_FOUR = 4;
        public final static int GRADE_FIVE = 5;
        public final static int GRADE_SIX = 6;
        public final static int GRADE_SEVEN = 7;



    }
}

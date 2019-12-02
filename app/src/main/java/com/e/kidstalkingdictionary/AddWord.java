package com.e.kidstalkingdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.e.kidstalkingdictionary.data.WordContract.WordEntry;
import com.e.kidstalkingdictionary.data.WordDbHelper;
import com.google.android.material.textfield.TextInputEditText;
import com.weiwangcn.betterspinner.library.BetterSpinner;

public class AddWord extends AppCompatActivity {

    private Spinner mgradeSpinner;

    private int mGrade = 0;

    TextInputEditText mWordEditText, mMeaningEditText, mDescriptionEditText;
    Button btnSave;
    WordDbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        // Find all relevent view ids that we need in user input
        mWordEditText = (TextInputEditText) findViewById(R.id.add_word);
        mgradeSpinner = (Spinner) findViewById(R.id.grade_spinner);
        mMeaningEditText = (TextInputEditText) findViewById(R.id.word_meaning);
        mDescriptionEditText = (TextInputEditText) findViewById(R.id.word_description);
        btnSave = (Button) findViewById(R.id.save_btn);

        setupSpinner();

        dbHelper = new WordDbHelper(getApplicationContext());

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertWord();
                finish();
            }
        });
    }

    public void insertWord() {
        String word = mWordEditText.getText().toString().trim();
        String meaning = mMeaningEditText.getText().toString().trim();
        String description = mDescriptionEditText.getText().toString().trim();

        WordDbHelper mWordDbHelper  = new WordDbHelper(this);

        SQLiteDatabase db = mWordDbHelper.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(WordEntry.COLUMN_GRADE,mGrade);
        values.put(WordEntry.COLUMN_DISCRIPTION,description);
        values.put(WordEntry.COLUMN_MEANING,meaning);
        values.put(WordEntry.COLUMN_WORD,word);

        long newRowId = db.insert(WordEntry.TABLE_NAME, null, values);

        if(newRowId == -1){
            Toast.makeText(this, "Error with Saving Word in Dictionary" + newRowId, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Word Saved with ID " + newRowId, Toast.LENGTH_SHORT).show();
        }

    }

    private void setupSpinner (){

        ArrayAdapter gradeSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.Array_grade_option,android.R.layout.simple_spinner_item);

        gradeSpinnerAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        mgradeSpinner.setAdapter(gradeSpinnerAdapter);

        mgradeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selection = (String) adapterView.getItemAtPosition(i);

                if(!TextUtils.isEmpty(selection)){

                    if(selection.equals("Grade One")){
                        mGrade = WordEntry.GRADE_ONE;
                    }else if (selection.equals("Grade Two")){
                        mGrade = WordEntry.GRADE_TWO;
                    }else if (selection.equals("Grade Three")){
                        mGrade = WordEntry.GRADE_THREE;
                    }else if (selection.equals("Grade Four")){
                        mGrade = WordEntry.GRADE_FOUR;
                    }else if (selection.equals("Grade Five")){
                        mGrade = WordEntry.GRADE_FIVE;
                    }else if (selection.equals("Grade Six")){
                        mGrade = WordEntry.GRADE_SIX;
                    }else if (selection.equals("Grade Seven")){
                        mGrade = WordEntry.GRADE_SEVEN;
                    }else{
                        mGrade = WordEntry.GRADE_UNKNOWN;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                mGrade = 0;
            }
        });


    }
}

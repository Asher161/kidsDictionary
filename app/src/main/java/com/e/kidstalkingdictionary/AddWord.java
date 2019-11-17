package com.e.kidstalkingdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.BetterSpinner;

public class AddWord extends AppCompatActivity {

    String[] spinnerList
        ={"Grade 1", "Grade 2","Grade3","Grade 4", "Grade 5","Grade6","Grade7"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,spinnerList);

        BetterSpinner betterSpinner = (BetterSpinner) findViewById(R.id.grade_spinner);
        betterSpinner.setAdapter(arrayAdapter);
    }
}

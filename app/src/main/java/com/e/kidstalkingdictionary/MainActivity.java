package com.e.kidstalkingdictionary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   /* //Creating DatabaseHelper Class Object
    DatabaseHelper databaseHelper;
    EditText editAddWord, editMeaning, editDescription, editGrade;
    Button buttonSaved; */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  //Calling object on run
        databaseHelper = new DatabaseHelper(this);

        editAddWord=(EditText)findViewById(R.id.add_word);
        editMeaning=(EditText)findViewById(R.id.word_meaning);
        editDescription=(EditText)findViewById(R.id.word_description);
        editGrade=(EditText)findViewById(R.id.word_grade);
        buttonSaved=(Button)findViewById(R.id.save_btn);
        DataSaved(); */


        //Find the ImageView id from XML Activity
        ImageView searchBtn = (ImageView) findViewById(R.id.search_btn);
        //On Click listener to navigate search btn to search activity
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SearchWords.class);
                startActivity(intent);
            }
        });

        //Find the ImageView id from XML Activity
        ImageView addBtn = (ImageView) findViewById(R.id.add_word_btn);
        //On Click listener to navigate search btn to search activity
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddWord.class);
                startActivity(intent);
            }
        });

        //Find the ImageView id from XML Activity
        ImageView favBtn = (ImageView) findViewById(R.id.favorite_btn);
        //On Click listener to navigate search btn to search activity
        favBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Favorite.class);
                startActivity(intent);
            }
        });

        //Find the ImageView id from XML Activity
        ImageView randomWords = (ImageView) findViewById(R.id.random_search_btn);
        //On Click listener to navigate search btn to search activity
        randomWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RandomSearch.class);
                startActivity(intent);
            }
        });

    }

   /* public void DataSaved(){
        buttonSaved.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        boolean isInserted =databaseHelper.InsertData(editAddWord.getText().toString(), editMeaning.getText().toString(), editDescription.getText().toString(), editGrade.getText().toString());
                        if(isInserted = true )
                            Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(MainActivity.this, "Data Not Inserted", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }  */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
           //Exit the Application
            case R.id.exit:
                this.finish();
                System.exit(0);
        }

        return super.onOptionsItemSelected(item);
    }
}

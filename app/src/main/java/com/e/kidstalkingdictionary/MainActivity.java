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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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

package com.e.kidstalkingdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ShowWords extends AppCompatActivity {


    String[] title = {"Apple","Apple","Apple","Apple","Apple","Apple","Apple"};
    String[] description = {"Fruit","Fruit","Fruit","Fruit","Fruit","Fruit","Fruit"};
    ListView listView;
    ImageButton addbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_words);
        listView = findViewById(R.id.listview);
        addbtn = (ImageButton) findViewById(R.id.addbutton);
        WordsList list = new WordsList();
        listView.setAdapter(list);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowWords.this,AddWord.class);
                startActivity(intent);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ShowWords.this,Word.class);
                startActivity(intent);
            }
        });
    }




    class WordsList extends BaseAdapter{

        @Override
        public int getCount() {
            return title.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.words_list,null);
            ImageView img = (ImageView)view.findViewById(R.id.img);
            TextView title_text = (TextView)view.findViewById(R.id.text_title);
            TextView desc_text = (TextView)view.findViewById(R.id.text_description);

            title_text.setText(title[i]);
            desc_text.setText(description[i]);
            return view;
        }
    }
}

package com.example.jawabanuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;

    ListView lv;

    String[] lvItems = {"Facebook", "Twitter", "Instagram",
            "WhatsApp", "LINE", "KakaoTalk", "Telegram", "Messenger",
            "YouTube", "TikTok", "SnapChat", "Vine", "Vimeo"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        lv = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, lvItems);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), facebook.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), twitter.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), instagram.class);
                    startActivityForResult(intent, 0);
                }

                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), whatsapp.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), line.class);
                    startActivityForResult(intent, 0);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), kakao.class);
                    startActivityForResult(intent, 0);
                }

                //Do the same thing next time

                Toast.makeText(getApplicationContext(),
                        "You have selected : " + lvItems[position],
                        Toast.LENGTH_SHORT).show();

            }
        });
    }


}







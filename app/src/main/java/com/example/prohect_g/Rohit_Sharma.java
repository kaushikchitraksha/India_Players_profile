package com.example.prohect_g;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Rohit_Sharma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        Intent i = getIntent();
        String listname = i.getStringExtra("ArrayListName");
        int playerImage = i.getIntExtra("PlayerImage",-1);
        int playerIndex = i.getIntExtra("postion",-1);


        ArrayList<profile> player = new ArrayList<profile>();

        if(playerIndex==0) {
            player.add(new profile(playerImage, listname, "Right Hand Batsman", "9", "8", "15"));
        }
        else if(playerIndex==1) {
            player.add(new profile(playerImage, listname, "Right Hand Batsman", "12", "7", "10"));
        }
        else if(playerIndex == 2) {
            player.add(new profile(playerImage, listname, "Right Hand Batsman", "45", "39", "22"));
        }
        else if(playerIndex == 3) {
            player.add(new profile(playerImage, listname, "Right Hand Batsman", "-", "62", "69"));
        }
        else if(playerIndex == 4) {
            player.add(new profile(playerImage, listname, "Bowling Allrounder", "2", "-", "18"));
        }
        else if(playerIndex == 5) {
            player.add(new profile(playerImage, listname, "legbreak Bowler", "-", "20", "38"));
        }
        else if(playerIndex == 6) {
            player.add(new profile(playerImage, listname, "fast-medium Bowler", "17", "41", "95"));
        }
        else if(playerIndex == 7) {
            player.add(new profile(playerImage, listname, "fast Bowler", "4", "10", "71"));
        }

        ProfileAdapter adapter =new ProfileAdapter(Rohit_Sharma.this,player);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
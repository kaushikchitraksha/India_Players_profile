package com.example.prohect_g;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Switch;

import java.util.ArrayList;
import java.lang.Class;




public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_item);

        ArrayList<OverView> Ind = new ArrayList<OverView>();

        Ind.add(new OverView(R.drawable.rohitsharma,"Rohit Sharma","Rohit_Sharma"));
        Ind.add(new OverView(R.drawable.virat_kohli,"Virat Kolhi","Virat_Kolhi"));
        Ind.add(new OverView(R.drawable.kl_rahul,"KL Rahul","K_Rahul"));
        Ind.add(new OverView(R.drawable.hardik_pandya,"Hardik Pandya","Hardik"));
        Ind.add(new OverView(R.drawable.ravichandran_ashwin,"Ravichandran Ashwin","R_Aswin"));
        Ind.add(new OverView(R.drawable.yuzvendra_chahal,"Yuzvendra Chahal","Uv_chahal"));
        Ind.add(new OverView(R.drawable.mohammed_shami,"Mohammed Shami","MD_Sami"));
        Ind.add(new OverView(R.drawable.jasprit_bumrah,"Jasprit Bumrah","J_Bumrah"));


        OverviewAdapter adapter =new OverviewAdapter(this,Ind);

        GridView gv = (GridView) findViewById(R.id.grid);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                OverView word = Ind.get(i);
                String Pname = word.getmName();
                int Pimage = word.getmImage();

                Intent intent = new Intent(MainActivity2.this, Rohit_Sharma.class);
                intent.putExtra("ArrayListName",Pname);
                intent.putExtra("PlayerImage",Pimage);
                intent.putExtra("postion",i);
                startActivity(intent);
            }
        });

        GridView gridView = (GridView) findViewById(R.id.grid);

        gridView.setAdapter(adapter);

    }
}
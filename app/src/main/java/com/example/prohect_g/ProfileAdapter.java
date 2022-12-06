package com.example.prohect_g;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.String;

import java.util.ArrayList;

public class ProfileAdapter extends ArrayAdapter<profile> {

    public ProfileAdapter(Activity context, ArrayList<profile> player) {
        super(context, 0, player);
    }
    @Override
    public View getView(int position, android.view.View convertView, ViewGroup parent) {
        View listItemView = convertView; // listItemView is currently referring the root LinerLayout for the list_item layout
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        profile currentWord = getItem(position);

        String vName = currentWord.getpName();


        MainActivity2 obj = new MainActivity2();
        String valueName2 = obj.toString();


            ImageView imageView = (ImageView) listItemView.findViewById(R.id.player_img);
            imageView.setImageResource(currentWord.getpImg());

            TextView ntv = (TextView) listItemView.findViewById(R.id.player_id);
            ntv.setText(currentWord.getpName());

            TextView rtv = (TextView) listItemView.findViewById(R.id.player_role);
            rtv.setText(currentWord.getpRole());

            TextView test = (TextView) listItemView.findViewById(R.id.test_rank);
            test.setText(currentWord.getPtestRank());

            TextView odi = (TextView) listItemView.findViewById(R.id.ODI_rank);
            odi.setText(currentWord.getpOdiRank());

            TextView t20 = (TextView) listItemView.findViewById(R.id.T20_rank);
            t20.setText(currentWord.getPtRank());

            return listItemView;



    }
}

package com.example.prohect_g;

import android.app.Activity;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class OverviewAdapter extends ArrayAdapter<OverView> {


    public OverviewAdapter(Activity context, ArrayList<OverView> Ind) {
        super(context, 0, Ind);

    }

    @Override
    public View getView(int position, android.view.View convertView, ViewGroup parent) {
        View listItemView = convertView; // listItemView is currently referring the root LinerLayout for the list_item layout
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_profile, parent, false);
        }

        OverView currentWord =getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img_view);
        imageView.setImageResource(currentWord.getmImage());

        TextView textView = (TextView) listItemView.findViewById(R.id.name_view);
        textView.setText(currentWord.getmName());





        return listItemView;



    }
}
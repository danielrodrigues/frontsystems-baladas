package com.frontsystems.baladas;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Daniel Rodrigues on 07/10/13.
 */
public class CustomListViewBaladaAdapter extends ArrayAdapter<CustomListViewBalada>{

    Context context;
    int layoutId;
    CustomListViewBalada data[] = null;

    public CustomListViewBaladaAdapter(Context context, int layoutId, CustomListViewBalada[] data){

        super(context,layoutId,data);

        this.layoutId = layoutId;
        this.context = context;
        this.data = data;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        CustomHolder holder = null;

        if(row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutId, parent, false);

            holder = new CustomHolder();
            holder.fotoBalada = (ImageView)row.findViewById(R.id.imagemBalada);
            holder.nomeBalada = (TextView)row.findViewById(R.id.nomeBalada);
            holder.telAndEnd = (TextView)row.findViewById(R.id.telAndEnd);

            row.setTag(holder);
        }
        else
        {
            holder = (CustomHolder)row.getTag();
        }

        CustomListViewBalada customView = data[position];
        holder.fotoBalada.setImageResource(customView.fotoBalada);
        holder.nomeBalada.setText(customView.nomeBalada);
        holder.telAndEnd.setText(customView.telAndEnd);

        return row;
    }
    static class CustomHolder{
        ImageView fotoBalada;
        TextView nomeBalada;
        TextView telAndEnd;
    }


}
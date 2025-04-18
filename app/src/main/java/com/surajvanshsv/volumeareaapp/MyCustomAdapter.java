package com.surajvanshsv.volumeareaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

// this class will be responsible for creating the view for each item and binding the data it
public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapeArrayList;
    Context context;


    public MyCustomAdapter(@NonNull Context context, ArrayList<Shape> shapeArrayList) {
        super(context, R.layout.grid_items_layout,shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }

    // view holder : used to cache references to the views within an item layout
    private static class MyViewHolder {
        TextView shapeName;
        ImageView shapeImg;
    }

    // getView(): used to create and return a view for a specific items in grid .

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //1. get the shape view for the current position
        Shape shapes = getItem(position);

        // inflating layout :
        MyViewHolder myViewHolder;

        if (convertView == null){
            // no view went off screen --> create a new view
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.grid_items_layout,
                    parent,
                    false
            );
            // finding the views
            myViewHolder.shapeImg = (ImageView) convertView.findViewById(R.id.imageView);
            myViewHolder.shapeName  = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(myViewHolder);
        }else {
            // a view went off screen --> re-use it
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        // getting the data from the model class
        myViewHolder.shapeName.setText(shapes.getShapeName());
        myViewHolder.shapeImg.setImageResource(shapes.getShapeImg());
        return convertView;
    }
}

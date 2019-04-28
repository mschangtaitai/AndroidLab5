package com.example.laboratory5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> tittles = new ArrayList<>();
    private ArrayList<String> cants = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> tittles, ArrayList<String> cants, Context context) {
        this.tittles = tittles;
        this.cants = cants;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: called");

        viewHolder.tittle.setText(tittles.get(i));
        viewHolder.cant.setText(cants.get(i));

        viewHolder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //cants.set(i, (cants.get(i).toInt()) + 1);
            }
        });

        viewHolder.subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //cants.set(i, (cants.get(i).toInt()) - 1);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tittles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tittle;
        TextView cant;
        Button addButton;
        Button subButton;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tittle = itemView.findViewById(R.id.item_tittle);
            cant = itemView.findViewById(R.id.cant_item);
            addButton = itemView.findViewById(R.id.imageButtonAdd);
            subButton = itemView.findViewById(R.id.imageButtonSub);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}

package com.example.recycleview;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class EmailVH extends RecyclerView.ViewHolder {
    ImageView img_1;
    TextView txt_1, txt_2, txt_3;
    Button b1;
    CardView cv1;


    public EmailVH(@NonNull View itemView) {
        super(itemView);
        img_1 = itemView.findViewById(R.id.img_1);
        txt_1 = itemView.findViewById(R.id.txt_1);
        txt_2 = itemView.findViewById(R.id.txt_2);
        b1 = itemView.findViewById(R.id.b1);
        txt_3 = itemView.findViewById(R.id.txt_3);
        cv1 = itemView.findViewById(R.id.cv1);

    }
}

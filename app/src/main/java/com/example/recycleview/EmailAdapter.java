package com.example.recycleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmailAdapter extends RecyclerView.Adapter<com.example.recycleview.EmailVH> {

    Context context;
    ArrayList<EmailModel> arrayList = new ArrayList<>();
    EmailAdapter(Context context, ArrayList<EmailModel> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public EmailVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.email_layout, parent, false);
        return new EmailVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull EmailVH holder, int position) {
        holder.img_1.setImageResource(arrayList.get(position).img_1);
        holder.txt_1.setText(arrayList.get(position).txt_1);
        holder.txt_2.setText(arrayList.get(position).txt_2);
        holder.txt_3.setText(arrayList.get(position).txt_3);
        holder.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "read it ", Toast.LENGTH_SHORT).show();

            }
        });
        holder.cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,MainActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}


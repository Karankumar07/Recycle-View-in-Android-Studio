package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class EmailActivity extends AppCompatActivity {
    RecyclerView cycle;
    EmailAdapter emailAdapter;
    ArrayList<EmailModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        cycle = findViewById(R.id.rv_1);
        cycle.setLayoutManager(new LinearLayoutManager(this));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD", "K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        arrayList.add(new EmailModel(R.drawable.baseline_account_circle_24, "Karan Kumar", "MAD","K.K"));
        emailAdapter = new EmailAdapter(this , arrayList);
        cycle.setAdapter(emailAdapter);

    }
}
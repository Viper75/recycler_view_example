package com.codewithsean.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mStringListRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStringListRv = findViewById(R.id.string_list_rv);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mStringListRv.setLayoutManager(layoutManager);

        String[] dataset = {
                "Sean Huvaya", "Tinashe Huvaya", "Prince Huvaya",
                "Sean Huvaya", "Tinashe Huvaya", "Prince Huvaya",
                "Sean Huvaya", "Tinashe Huvaya", "Prince Huvaya",
                "Sean Huvaya", "Tinashe Huvaya", "Prince Huvaya",
                "Sean Huvaya", "Tinashe Huvaya", "Prince Huvaya"
        };

        NamesAdapter adapter = new NamesAdapter(dataset);
        mStringListRv.setAdapter(adapter);
    }
}
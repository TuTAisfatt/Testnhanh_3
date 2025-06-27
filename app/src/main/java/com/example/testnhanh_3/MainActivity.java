package com.example.testnhanh_3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SportAdapter adapter;
    List<Sports> sportsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sportsList = new ArrayList<>();
        sportsList.add(new Sports("Soccer", R.drawable.soccer));
        sportsList.add(new Sports("Basketball", R.drawable.basketball));
        sportsList.add(new Sports("Tennis", R.drawable.tennis));
        sportsList.add(new Sports("Baseball", R.drawable.baseball));
        sportsList.add(new Sports("Hockey", R.drawable.hockey));
        sportsList.add(new Sports("Cricket", R.drawable.cricket));
        sportsList.add(new Sports("Badminton", R.drawable.badminton));
        // Add more sports as needed

        adapter = new SportAdapter(sportsList);
        recyclerView.setAdapter(adapter);
    }
}

package com.example.tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleView);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Rifqi Zidan", "2021001",
                "2021"));
        mahasiswaArrayList.add(new Mahasiswa("Salwa Aljaidi", "2021002",
                "2021"));
        mahasiswaArrayList.add(new Mahasiswa("Hadid Salsabila", "2021003",
                "2021"));
        mahasiswaArrayList.add(new Mahasiswa("Didik Nugroho", "2021004",
                "2021"));
        mahasiswaArrayList.add(new Mahasiswa("Nining Cahya", "2021005",
                "2021"));
        mahasiswaArrayList.add(new Mahasiswa("Titin Prihatini", "2021006",
                "2021"));
    }
}

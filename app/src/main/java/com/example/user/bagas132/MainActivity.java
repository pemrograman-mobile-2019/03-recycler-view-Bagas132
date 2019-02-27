package com.example.user.bagas132;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.bagas132.adapter.ContactsAdapter;
import com.example.user.bagas132.adapter.MahasiswaAdapter;
import com.example.user.bagas132.models.Contact;
import com.example.user.bagas132.models.Mahasiswa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView =  findViewById(R.id.list_item);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309", "Mesin"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560", "Elektro"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345", "TI"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "Manajemen Informatika"));
        mahasiswaArrayList.add(new Mahasiswa("Siswoyo", "1214378098", "Manajemen Informatika"));
        mahasiswaArrayList.add(new Mahasiswa("bii", "1214378098", "Manajemen Informatika"));
        mahasiswaArrayList.add(new Mahasiswa("ahok", "1214378098", "Manajemen Informatika"));
        mahasiswaArrayList.add(new Mahasiswa("jabang", "1214378098", "Manajemen Informatika"));
        mahasiswaArrayList.add(new Mahasiswa("nanda", "1214378098", "Manajemen Informatika"));
        mahasiswaArrayList.add(new Mahasiswa("huril", "1214378098", "Manajemen Informatika"));

    }


}

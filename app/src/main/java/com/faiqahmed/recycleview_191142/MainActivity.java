package com.faiqahmed.recycleview_191142;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.faiqahmed.recycleview_191142.Adaptor.RecyclerView_Adaptor;
import com.faiqahmed.recycleview_191142.Student.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List <Student>  list = new ArrayList<>();
    RecyclerView_Adaptor recyclerView_adaptor;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.Recycler123);
        list.add(new Student("FaiqAhmed","191142","1.11"));
        list.add(new Student("Skyrim","11/11/11","1.00"));
        list.add(new Student("Red dead redemption 2","11/09/2018","3.1"));
        list.add(new Student("Death stranding","12/01/2020","2.13"));
        list.add(new Student("fallout 4","25/10/2015","2.22"));
        list.add(new Student("Gta V","21/07/2013","1.11"));
        list.add(new Student("GTA 6","TBD","0.00"));
        recyclerView_adaptor= new RecyclerView_Adaptor(list, MainActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerView_adaptor);
    }
}
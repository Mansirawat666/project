package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class car extends AppCompatActivity {
    ListView l3;
    String name[]={"BMW","Audi","Hyundai","Mercedes"};
    ArrayAdapter<String> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
        l3=findViewById(R.id.l1) ;
        arr=new ArrayAdapter<>(car.this,android.R.layout.simple_list_item_1,name);
        l3.setAdapter(arr);
        l3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        Intent j=new Intent(car.this,bmw.class);
                        startActivity(j);
                        break;
                    case 1:
                        Intent k=new Intent(car.this,audi.class);
                        startActivity(k);
                        break;
                    case 2:
                        Intent m=new Intent(car.this,hyundai.class);
                        startActivity(m);
                        break;
                    case 3:
                        Intent n=new Intent(car.this,mercedes.class);
                        startActivity(n);
                        break;
                }
            }
        });
    }
}

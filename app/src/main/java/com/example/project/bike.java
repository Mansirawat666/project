package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class bike extends AppCompatActivity {
    ListView l4;
    String nam[]={"Pulsur","Passion","Yamaha","FZ5"};
    ArrayAdapter<String> ar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike);
        l4=findViewById(R.id.l2);
        ar= new ArrayAdapter<>(bike.this,android.R.layout.simple_list_item_1,nam);
        l4.setAdapter(ar);
        l4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int z, long l) {

                switch(z){
                    case 0:
                        Intent b=new Intent(bike.this,pulsur.class);
                        startActivity(b);
                        break;
                    case 1:
                        Intent c=new Intent(bike.this,passion.class);
                        startActivity(c);
                        break;
                    case 2:
                        Intent d=new Intent(bike.this,yamaha.class);
                        startActivity(d);
                        break;
                    case 3:
                        Intent e=new Intent(bike.this,fz5.class);
                        startActivity(e);
                        break;
                }
            }
        });
    }
}

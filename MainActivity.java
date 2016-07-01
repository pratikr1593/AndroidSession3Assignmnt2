package com.example.pratikratnaparkhi.vibgyor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {


    TextView tv01,tv02,tv03,tv04,tv05,tv06,tv07;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv01=(TextView) findViewById(R.id.TextView01);
        tv01.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(getBaseContext(),"you selected red", Toast.LENGTH_SHORT).show();
            }

        });

        tv02=(TextView) findViewById(R.id.TextView02);
        tv02.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(getBaseContext(),"you selected orange", Toast.LENGTH_SHORT).show();
            }

        });

        tv03=(TextView) findViewById(R.id.TextView03);
        tv03.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(getBaseContext(),"you selested yellow", Toast.LENGTH_SHORT).show();
            }

        });

        tv04=(TextView) findViewById(R.id.TextView04);
        tv04.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(getBaseContext(),"you selested Green", Toast.LENGTH_SHORT).show();
            }

        });

        tv05=(TextView) findViewById(R.id.TextView05);
        tv05.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(getBaseContext(),"you selested Blue", Toast.LENGTH_SHORT).show();
            }

        });
        tv06=(TextView) findViewById(R.id.TextView06);
        tv06.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(getBaseContext(),"you selested Indigo", Toast.LENGTH_SHORT).show();
            }

        });

        tv07=(TextView) findViewById(R.id.TextView07);
        tv07.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(getBaseContext(),"you selested Violet", Toast.LENGTH_SHORT).show();
            }

        });











    }
}

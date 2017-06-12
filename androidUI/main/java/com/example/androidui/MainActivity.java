package com.example.androidui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.database.AbstractCursor;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Integer[] intList = new Integer[] {1,2,3,4,5,6,7,8,9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //Button horizontal = (Button) findViewById(R.id.horizontal);
        TextView hori = (TextView) findViewById(R.id.Layout1);
        hori.setOnClickListener(new View.OnClickListener() {
            ;

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, horizontal_layout.class);
                startActivity(intent);
            }
        });

        TextView vert = (TextView) findViewById(R.id.Layout2);
        vert.setOnClickListener(new View.OnClickListener() {
            ;

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vertical_layout.class);
                startActivity(intent);
            }
        });

        TextView grid = (TextView) findViewById(R.id.Layout3);
        grid.setOnClickListener(new View.OnClickListener() {
            ;

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, grid_layout.class);
                startActivity(intent);
            }
        });

        TextView rel = (TextView) findViewById(R.id.Layout4);
        rel.setOnClickListener(new View.OnClickListener() {
            ;

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, relative_layout.class);
                startActivity(intent);
            }
        });
    }

}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button b;
    private EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hehe();
    }

    public void  hehe() {
        b = (Button)findViewById(R.id.button3);
        edit = (EditText)findViewById(R.id.editText3);
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (edit.length() != 0)
                            Toast.makeText(
                                MainActivity.this,
                                "уууу" + edit.getText(),
                                Toast.LENGTH_SHORT
                            ).show();
                    }
                }
        );
    }


}

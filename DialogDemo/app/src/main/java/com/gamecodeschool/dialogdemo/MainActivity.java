package com.gamecodeschool.dialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new
                View.OnClickListener(){
                    @Override
                            public void onClick(View v){
                        MyDialog myDialog = new MyDialog();
                        myDialog.show(getSupportFragmentManager(),"123");


                    }
        });
    }
}
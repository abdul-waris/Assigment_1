package com.snailtail.test_w;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int num1 = intent.getIntExtra(MainActivity.EXTRA_NUM1,0);
        int num2 = intent.getIntExtra(MainActivity.EXTRA_NUM2,0);

        TextView textView = findViewById(R.id.text_view1);

        textView.append("" + (num1 + num2));

    }

}

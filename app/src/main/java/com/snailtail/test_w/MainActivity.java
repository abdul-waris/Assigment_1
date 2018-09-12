package com.snailtail.test_w;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUM1 = "com.snailtail.test_w.EXTRA_NUM1";
    public static final String EXTRA_NUM2 = "com.snailtail.test_w.EXTRA_NUM2";


    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getResult();
            }
        });
    }

    private void getResult() {
        EditText editText1 = (EditText) findViewById(R.id.edit_text1);
        int num1 = Integer.parseInt(editText1.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.edit_text2);
        int num2= Integer.parseInt(editText2.getText().toString());


        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra(EXTRA_NUM1,num1);
        intent.putExtra(EXTRA_NUM2,num2);
        startActivity(intent);

    }
}

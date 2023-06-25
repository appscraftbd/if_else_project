package com.appscraftbd.ifelseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class work2 extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work2);

        button = findViewById(R.id.btn2);
        editText = findViewById(R.id.et2);
        textView = findViewById(R.id.tv2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stext = editText.getText().toString();
                int number = Integer.parseInt(stext);



                if (number%400 ==0){

                    textView.setText(number +" is leap year ");

                } else if (number%4==0 && number%100!=0){

                    textView.setText(number +" is leap year ");


                }else {

                    textView.setText(number +" isn't leap year ");


                }



            }
        });
    }
}
package com.appscraftbd.ifelseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class work1 extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work1);

        button = findViewById(R.id.btn1);
        editText = findViewById(R.id.et1);
        textView = findViewById(R.id.tv1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stext = editText.getText().toString();
                int number = Integer.parseInt(stext);



                if ( number%5 == 0 && number%11 ==0){
                    textView.setText("Number is divisible by 5 and 11");

                }else {
                    textView.setText("Number isn't divisible by 5 and 11");
                }



            }
        });




    }
}
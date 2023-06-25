package com.appscraftbd.ifelseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class work5 extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work5);


        editText = findViewById(R.id.et5);
        textView = findViewById(R.id.tv5);
        button = findViewById(R.id.btn5);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String snumber = editText.getText().toString();
                int unit = Integer.parseInt(snumber);

                ////////////////////////////////////////////////////

                if(unit <= 50){

                    double price = (unit*0.50);
                    double fprice = price+(price*0.20);

                    textView.setText("Bill = "+fprice);


                } else if ( unit <= 150 ) {

                    double price = 25 + (unit-50)*0.75;
                    double fprice = price +(price*0.20);

                    textView.setText("Bill = "+fprice );

                } else if ( unit <= 250 ) {

                 double price = 25 + 57 + (unit-150)*1.20;
                 double fprice = price +(price*0.20);

                  textView.setText("Bill = "+fprice );

            }else {

                    double price = 25 + 57 + 120 +  (unit-250)*1.50;
                    double fprice = price +(price*0.20);

                    textView.setText("Bill = "+fprice );

                }


                //////////////////////////////////////////////////////////////
            }
        });





    }
}
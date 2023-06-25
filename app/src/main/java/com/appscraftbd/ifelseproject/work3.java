package com.appscraftbd.ifelseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class work3 extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work3);


        button = findViewById(R.id.btn3);
        editText = findViewById(R.id.et3);
        textView = findViewById(R.id.tv3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String stext = editText.getText().toString();
                int number = Integer.parseInt(stext);


                if (number > 7 || number <1){
                    editText.setError("isn't a weak day");


                }else {
                    /////////////////////////////////////////////////////////////
                    if (number ==1){
                        textView.setText("Saturday");
                    }

                    else if (number ==2) {
                        textView.setText("Sunday");
                    }

                    else if (number ==3) {
                        textView.setText("Monday");

                    }

                    else if (number == 4) {
                        textView.setText("Tuesday");

                    }

                    else if (number == 5) {
                        textView.setText("Wednesday");
                    }

                    else if (number == 6) {
                        textView.setText("Thursday");

                    }

                    else if (number ==7) {
                        textView.setText("Friday");

                    }


                    ///////////////////////////////////////////////////////////////
                }








            }
        });













    }
}
package com.appscraftbd.ifelseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class work4 extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work4);

        et1 = findViewById(R.id.et_sud1);
        et2 = findViewById(R.id.et_sud2);
        et3 = findViewById(R.id.et_sud3);
        et4 = findViewById(R.id.et_sud4);
        et5 = findViewById(R.id.et_sud5);

        button = findViewById(R.id.btn4);
        textView = findViewById(R.id.tv4);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                String s3 = et3.getText().toString();
                String s4 = et4.getText().toString();
                String s5 = et5.getText().toString();

                int nu1 = Integer.parseInt(s1);
                int nu2 = Integer.parseInt(s2);
                int nu3 = Integer.parseInt(s3);
                int nu4 = Integer.parseInt(s4);
                int nu5 = Integer.parseInt(s5);


                if(nu1 <40 || nu2<40 || nu3 <40 || nu4 <40 || nu5 < 40){
                    textView.setText("Fale");
                    


                } else if  (nu1 <100 || nu2 <100 || nu3 <100 || nu4 <100 || nu5 <100  ) {
                    textView.setText("Number Error: not allow 100+ number");

                } else {
                    textView.setText("All Subject pass");


                    ///////////////////////////////


                    double total = (nu1 + nu2 + nu3 +
                            nu4 + nu5 ) / 5.0;
                    textView.append("\nTotal ="+total);



                    if(total >= 90){
                        textView.append("\nGrade A");
                    }else if(total >= 80){
                        textView.append("\nGrade B");
                    }else if(total >= 70){
                        textView.append("\nGrade C");
                    }else if(total >= 60){
                        textView.append("\nGrade D");
                    }else if(total >= 40){
                        textView.append("\nGrade E");
                    }else {

                    }


                    ///////////////////////////////
                }





            }
        });





    }
}
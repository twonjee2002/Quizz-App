package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String kenyaCapital;
RadioButton radioButton;
    private RadioGroup radioGroup;
       private Button btnDisplay;
    private static final String DEBUG_TAG = "TKT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*Here is the method I created to be trigerred when the submit
     button is clicked for question 1. The method is called onQ1Click
     which is also added as onClick on the button in activity_main.xml
     So all buttons will have methods in this java class.

     When the correct answer is picked it goes to question 2 otherwise question 1 has
     to be answered correctly etc.
      */
        public void onQ1Click(View view){
            radioGroup = (RadioGroup) findViewById(R.id.radio_group1);
            kenyaCapital = "Nairobi";

            int selectedId = radioGroup.getCheckedRadioButtonId();
            Log.d(DEBUG_TAG, "selected is " + selectedId);
            // find the radiobutton by returned id
            radioButton = (RadioButton) findViewById(selectedId);
            Log.d(DEBUG_TAG, "answer picked is " + radioButton.getText());
            if (radioButton.getText().equals("Nairobi")) {
                Toast.makeText(MainActivity.this,
                        "Correct Answer", Toast.LENGTH_SHORT).show();
                     setContentView(R.layout.activity_q2);
            }else{
                Toast.makeText(MainActivity.this,
                        "Wrong Answer, Try again", Toast.LENGTH_SHORT).show();
                setContentView(R.layout.activity_main);
            }



        }

}

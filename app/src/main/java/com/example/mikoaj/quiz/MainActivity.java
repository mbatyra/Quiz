package com.example.mikoaj.quiz;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int result = 0;
    String text = "Wynik: " + result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup1);
        final RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        final RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.radioGroup3);
        final RadioGroup radioGroup4 = (RadioGroup)findViewById(R.id.radioGroup4);
        final RadioGroup radioGroup5 = (RadioGroup)findViewById(R.id.radioGroup5);


        //int zaznaczonyId = radioGroup.getCheckedRadioButtonId();
        //RadioButton radioButton11 = (RadioButton)findViewById(zaznaczonyId);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.radioButton1)
                    result++;
                text = "Wynik: " + result;
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                if (checkedId == R.id.radioButton1 || checkedId == R.id.radioButton2)
                    for (int i = 0; i < radioGroup.getChildCount(); i++) {
                        (radioGroup.getChildAt(i)).setEnabled(false);
                    }
            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.radioButton4)
                    result++;
                text = "Wynik: " + result;
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                if (checkedId == R.id.radioButton3 || checkedId == R.id.radioButton4)
                    for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                        (radioGroup2.getChildAt(i)).setEnabled(false);
                    }
            }
        });

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.radioButton5)
                    result++;
                text = "Wynik: " + result;
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                if (checkedId == R.id.radioButton5 || checkedId == R.id.radioButton6)
                    for (int i = 0; i < radioGroup3.getChildCount(); i++) {
                        (radioGroup3.getChildAt(i)).setEnabled(false);
                    }
            }
        });

        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.radioButton8)
                    result++;
                text = "Wynik: " + result;
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                if (checkedId == R.id.radioButton7 || checkedId == R.id.radioButton8)
                    for (int i = 0; i < radioGroup4.getChildCount(); i++) {
                        (radioGroup4.getChildAt(i)).setEnabled(false);
                    }
            }
        });

        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.radioButton9)
                    result++;
                text = "Wynik: " + result;
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
                if (checkedId == R.id.radioButton9 || checkedId == R.id.radioButton10)
                    for (int i = 0; i < radioGroup5.getChildCount(); i++) {
                        (radioGroup5.getChildAt(i)).setEnabled(false);
                    }
            }
        });




    }
}

package com.example.rafay.billcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected EditText prev1;
    protected EditText prev2;
    protected EditText prev3;
    protected EditText prev4;
    protected EditText next1;
    protected EditText next2;
    protected EditText next3;
    protected EditText next4;
    protected EditText total;
    protected TextView res1;
    protected TextView res2;
    protected TextView res3;
    protected TextView res4;
    protected TextView Unit1;
    protected TextView Unit2;
    protected TextView Unit3;
    protected TextView Unit4;
    protected TextView perUnits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClick(View v) {
        Log.d("Creation", "on create");
        EditText prev1 = findViewById(R.id.prev1);
        EditText prev2 = findViewById(R.id.prev2);
        EditText prev3 = findViewById(R.id.prev3);
        EditText prev4 = findViewById(R.id.prev4);
        EditText next1 = findViewById(R.id.next1);
        EditText next2 = findViewById(R.id.next2);
        EditText next3 = findViewById(R.id.next3);
        EditText next4 = findViewById(R.id.next4);
        EditText total = findViewById(R.id.total);
        TextView res1 = findViewById(R.id.res1);
        TextView res2 = findViewById(R.id.res2);
        TextView res3 = findViewById(R.id.res3);
        TextView res4 = findViewById(R.id.res4);
        TextView unit1 = findViewById(R.id.unit1);
        TextView Unit2 = findViewById(R.id.Unit2);
        TextView Unit3 = findViewById(R.id.Unit3);
        TextView Unit4 = findViewById(R.id.Unit4);
        TextView perUnits = findViewById(R.id.perUnits);

        float diff1, diff2, diff3, diff4, unitSum=0;
        float p1 = Float.parseFloat(prev1.getText().toString());
        float p2 = Float.parseFloat(prev2.getText().toString());
        float p3 = Float.parseFloat(prev3.getText().toString());
        float p4 = Float.parseFloat(prev4.getText().toString());
        float n1 = Float.parseFloat(next1.getText().toString());
        float n2 = Float.parseFloat(next2.getText().toString());
        float n3 = Float.parseFloat(next3.getText().toString());
        float n4 = Float.parseFloat(next4.getText().toString());
        float tot = Float.parseFloat(total.getText().toString());
        diff1 = n1 - p1;
        diff2 = n2 - p2;
        diff3 = n3 - p3;
        diff4 = n4 - p4;
        unitSum = diff1 + diff2 + diff3 + diff4;
        float perUnit = tot / unitSum;
        float result1=0, result2=0, result3=0, result4=0;
        result1 = perUnit * diff1;
        result2 = perUnit * diff2;
        result3 = perUnit * diff3;
        result4 = perUnit * diff4;

        res1.setText(String.valueOf(result1));
        res2.setText(String.valueOf(result2));
        res3.setText(String.valueOf(result3));
        res4.setText(String.valueOf(result4));

        unit1.setText(String.valueOf(diff1));
        Unit2.setText(String.valueOf(diff2));
        Unit3.setText(String.valueOf(diff3));
        Unit4.setText(String.valueOf(diff4));

        perUnits.setText(String.valueOf(perUnit));

    }

}

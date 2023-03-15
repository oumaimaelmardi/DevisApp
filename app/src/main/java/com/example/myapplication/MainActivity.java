package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   private Button btn;
   private EditText text;
   private TextView resul;
   private TextView textView;
   private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.editTextNumber);
        resul=findViewById(R.id.result);
        textView=findViewById(R.id.textView);
        btn=findViewById(R.id.button2);
        spinner = findViewById(R.id.spinner);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
            }
        });

        ArrayList<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("MAD");
        spinnerArray.add("DOLLAR");
        spinnerArray.add("EURO");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int arg2, long arg3) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

    public void convert(){
      /*  String amountdollars=text.getText().toString();
        if(amountdollars.equals("")){
            Toast.makeText(this,"Enter a valid number",Toast.LENGTH_SHORT).show();
        }else{
            Double amount=Double.parseDouble(amountdollars);
            Double amountFinal=amount * 0.095;
            resul.setText(amountFinal+"$");

        }*/
        String selected = spinner.getSelectedItem().toString();
        double number = Double.parseDouble(text.getText().toString());
        if (selected=="MAD"){
            double dollar = number * 0.098;
            double euro = number * 0.090;
            resul.setText(dollar + " DOLLAR");
            textView.setText(euro + " EURO");
        } else if (selected=="DOLLAR") {
            double mad = number * 10.46;
            double euro = number * 0.95;
            resul.setText(mad + " MAD");
            textView.setText(euro + " EURO");
        } else if (selected=="EURO") {
            double mad = number * 11.06;
            double dollar = number * 1.06;
            resul.setText(mad + " MAD");
            textView.setText(dollar + " DOLLAR");
        }
    }



}
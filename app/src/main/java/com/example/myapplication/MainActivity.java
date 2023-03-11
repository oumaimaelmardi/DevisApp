package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button btn;
   private EditText text;
   private TextView resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.editTextNumber);
        resul=findViewById(R.id.result);
        btn=findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
            }
        });
    }

    public void convert(){
        String amountdollars=text.getText().toString();
        if(amountdollars.equals("")){
            Toast.makeText(this,"Enter a valid number",Toast.LENGTH_SHORT).show();
        }else{
            Double amount=Double.parseDouble(amountdollars);
            Double amountFinal=amount * 0.095;
            resul.setText(amountFinal+"$");

        }
    }



}
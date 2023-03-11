package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.myapplication.databinding.ActivityMain2Binding;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TextInputEditText login=(TextInputEditText) findViewById(R.id.login);
        TextView password=(TextView) findViewById(R.id.password
        );
        Button loginbtn = (Button) findViewById(R.id.sign);

          loginbtn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(login.getText().toString().equals("admin") ){
                      Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                      startActivity(intent);

                  }
              }
          });
    }

}
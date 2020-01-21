package com.tj.regform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText email;
    private EditText phone;
    private EditText passw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        passw = (EditText)findViewById(R.id.password);


         }
    public void login(View view){
        if (passw.getText().toString().equals("password")) {

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Hello "+name.getText().toString()+"!",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Credentials incorrect :(",
                    Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
}

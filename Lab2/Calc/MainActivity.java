package com.tj.lab1.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    EditText text = (EditText)findViewById(R.id.text);
    public int flag;
    public String prevVal;
    public String newVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void zero(View view)
    {
        text.setText(text.getText()+"0");
    }
    public void one(View v)
    {
        text.setText(text.getText()+"1");
    }
    public void two(View v)
    {
        text.setText(text.getText()+"2");
    }
    public void three(View v)
    {
        text.setText(text.getText()+"3");
    }
    public void four(View v)
    {
        text.setText(text.getText()+"4");
    }
    public void five(View v)
    {
        text.setText(text.getText()+"5");
    }
    public void six(View v)
    {
        text.setText(text.getText()+"6");
    }
    public void seven(View v)
    {
        text.setText(text.getText()+"7");
    }
    public void eight(View v)
    {
        text.setText(text.getText()+"8");
    }
    public void nine(View v)
    {
        text.setText(text.getText()+"9");
    }
    public void clear(View v)
    {
        text.setText("");
    }
    public void plus(View v)
    {
        prevVal = text.getText().toString();
        text.setText("");
        flag = 1;
    }
    public void minus(View v)
    {
        text.setText("");
        flag=2;
    }
    public void res(View v)
    {
        switch (flag)
        {
            case 1:
                newVal = text.getText().toString();
                text.setText("");
                int sum = parseInt(newVal)+parseInt(prevVal);
                text.setText(sum);
                break;
            case 2:
                newVal = text.getText().toString();
                text.setText("");
                int diff = parseInt(newVal)-parseInt(prevVal);
                text.setText(diff);
                break;
        }
    }

}

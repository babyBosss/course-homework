package com.lxvd.homework1;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    private Button button;

    private View.OnClickListener onButtonCL = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String str = text.getText().toString();
            if(!str.trim().isEmpty()){
            showMessage(str);}

            Intent nextActivity = new Intent(MainActivity.this, SecondActivity.class);
            nextActivity.putExtra(SecondActivity.MESSAGE, str);
            startActivity(nextActivity);
        }
    };

    public void showMessage(String string) {
        Toast.makeText(getApplicationContext(), string, Toast.LENGTH_LONG).show();
    }
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonV);
        text = findViewById(R.id.textV);
        button.setOnClickListener(onButtonCL);
    }
}

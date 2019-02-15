package com.lxvd.homework1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView text2;
    private Button button2;

    public static String MESSAGE = "MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        text2 = findViewById(R.id.text2V);
        button2 = findViewById(R.id.button2V);

        Bundle bundle = getIntent().getExtras();
        text2.setText(bundle.getString(MESSAGE));
    }
}

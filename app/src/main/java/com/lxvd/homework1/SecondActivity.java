package com.lxvd.homework1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView text2;
    private Button button2;

    private View.OnClickListener onButtonCL2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/#q=" + text2.getText().toString()));

            startActivity(browserIntent);
        }
    };
    public static String MESSAGE = "MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        text2 = findViewById(R.id.text2V);
        button2 = findViewById(R.id.button2V);
        button2.setOnClickListener(onButtonCL2);


        Bundle bundle = getIntent().getExtras();
        text2.setText(bundle.getString(MESSAGE));
    }
}

package com.example.taruc.lab2_1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
        Bundle extra = getIntent().getExtras();

        if(!extra.isEmpty()){
            String message = extra.getString("MESSAGE");
            textViewMessage.setText(message);
        }
    }
}

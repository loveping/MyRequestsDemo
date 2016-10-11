package com.example.dan.myrequestsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button click_me_BN;
    private TextView result_TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click_me_BN = (Button) findViewById(R.id.click_me_BN);
        result_TV = (TextView) findViewById(R.id.result_TV);
    }
}

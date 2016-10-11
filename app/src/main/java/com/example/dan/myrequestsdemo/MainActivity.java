package com.example.dan.myrequestsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dan.myrequestsdemo.android_rx.RxUtils;

/**
 *
 */
public class MainActivity extends AppCompatActivity {

    private Button click_me_BN;
    private TextView result_TV;
    private ImageView img_01;
    private String path = "http://pic33.nipic.com/20130916/3420027_192919547000_2.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click_me_BN = (Button) findViewById(R.id.click_me_BN);
        result_TV = (TextView) findViewById(R.id.result_TV);
        img_01 = (ImageView) findViewById(R.id.img_01);

        click_me_BN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RxUtils.createObserable();
               // Toast.makeText(MainActivity.this,"aaa",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

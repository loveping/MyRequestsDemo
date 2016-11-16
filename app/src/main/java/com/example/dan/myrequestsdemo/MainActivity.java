package com.example.dan.myrequestsdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dan.myrequestsdemo.Network.OkHttp3Request;
import com.example.dan.myrequestsdemo.android_rx.DownloadUtils;
import com.example.dan.myrequestsdemo.android_rx.RxUtils;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 *Created by dan on 2016/10/10.
 *QQ：435675213
 */

public class MainActivity extends AppCompatActivity {

    private Button click_me_BN;
    private TextView result_TV;
    private ImageView img_01;
    private String path = "http://www.fastersoft.com.cn:83/grainmonitor/app/queryNewsList.shtml";
    private DownloadUtils downloadUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click_me_BN = (Button) findViewById(R.id.click_me_BN);
        img_01 = (ImageView) findViewById(R.id.img_01);
        result_TV = (TextView) findViewById(R.id.result_TV);

        downloadUtils = new DownloadUtils();
        click_me_BN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                downloadUtils.downImage(path)
//                        .subscribeOn(Schedulers.io())
//                        .observeOn(AndroidSchedulers.mainThread())
//                        .subscribe(new Subscriber<byte[]>() {
//                            @Override
//                            public void onCompleted() {
//                                Log.i("MainActivity***********", "onCompleted");
//                            }
//
//                            @Override
//                            public void onError(Throwable e) {
//                                Log.i("MainActivity***********", e.getMessage());
//                            }
//
//                            @Override
//                            public void onNext(byte[] bytes) {
//                                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
//                                img_01.setImageBitmap(bitmap);
//                            }
//                        });

                OkHttp3Request.get()
                        .url(path)
                        .addParams("iDisplayStart", "1")
                        .addParams("iDisplayLength", "10")
                        .build()
                        .execute()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<String>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {
                                Log.i("***************onError",e.getMessage());
                            }

                            @Override
                            public void onNext(String s) {
                                result_TV.setText(s);
                                Log.i("***************",s);
                            }
                        });
            }
        });
    }
}

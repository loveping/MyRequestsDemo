package com.example.dan.myrequestsdemo.android_rx;

import java.io.IOException;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by dan on 2016/10/12.
 */

public class DownloadUtils {

    private OkHttpClient client;

    public DownloadUtils(){
        client = new OkHttpClient();
    }

    public Observable <byte []> downImage(String path){
        return Observable.create(new Observable.OnSubscribe<byte[]>() {
            @Override
            public void call(Subscriber<? super byte[]> subscriber) {
                if (!subscriber.isUnsubscribed()){
                    //访问网络操作
                    Request request = new Request.Builder().url(path).build();

                    client.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(okhttp3.Call call, IOException e) {
                            subscriber.onError(e);
                        }

                        @Override
                        public void onResponse(okhttp3.Call call, Response response) throws IOException {
                            if (response.isSuccessful()){
                                byte[] data = response.body().bytes();
                                if (data!=null){
                                    subscriber.onNext(data);
                                }
                            }
                            subscriber.onCompleted();

                        }

                    });

                }
            }
        });
    }
}

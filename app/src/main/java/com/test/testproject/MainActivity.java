package com.test.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.ads.Ads;

public class MainActivity extends AppCompatActivity {

    TextView serverDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String apiKey = "fvckzaoosilwajs";

        serverDataTextView = findViewById(R.id.servers);

        Ads.fetchData(this, apiKey, new Ads.ApiResponseListener() {
            @Override
            public void onSuccess(String result) {

                serverDataTextView.setText(result);
            }

            @Override
            public void onError(String errorMessage) {
                serverDataTextView.setText("Error: " + errorMessage);
            }
        });



    }
}
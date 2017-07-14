package com.example.kensukeizumi.webviewsample;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView  myWebView = (WebView)findViewById(R.id.webView1);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.loadUrl("http://www.google.co.jp");

        myWebView.getSettings().setJavaScriptEnabled(true);
    }
}

package com.example.auto;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        webview.clearCache(true);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://192.168.31.200:8083/phongmo/phong?id=1");//Link URL truy cập web "đối với link localhost thêm đầu trang http://"  "phong?id=1 là phòng 1 "
        Log.i(TAG,"Exiting onCreate");
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed() {
        if(webview.canGoBack())
        {
            webview.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
package com.example.fastitbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mywebview=(WebView) findViewById(R.id.WebViewID);
        mywebview.loadUrl("https://fastitbd.com/");
        mywebview.setWebViewClient(new WebViewClient());
        WebSettings x=mywebview.getSettings();
        x.setJavaScriptEnabled(true);
        x.setSupportZoom(true);
        x.setBuiltInZoomControls(false);
        x.setCacheMode (WebSettings.LOAD_NO_CACHE);
        x.setDomStorageEnabled(true);
        mywebview.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        mywebview.setScrollbarFadingEnabled(true);


    }


    @Override
    public void onBackPressed() {
        if (mywebview.canGoBack()){
            mywebview.goBack();
        }
        else{
            finish();
        }
    }
}
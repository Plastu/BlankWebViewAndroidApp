package com.example.plast.plast2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


public class HelloWorldApp extends Activity {


    @Override
    public void onCreate(Bundle savedInterface){
        super.onCreate(savedInterface);
        setContentView(R.layout.main);
        JavaScriptInterface jsInterface = new JavaScriptInterface(this);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(jsInterface, "JSInterface");
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.loadUrl("file:///android_asset/www/index.html");

    }


}

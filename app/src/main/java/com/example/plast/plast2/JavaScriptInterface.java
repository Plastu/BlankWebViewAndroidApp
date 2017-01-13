package com.example.plast.plast2;

import android.app.Activity;
import android.content.Intent;
import android.webkit.JavascriptInterface;

/**
 * Created by r3452166 on 2017-01-12.
 */

public class JavaScriptInterface {
    private Activity activity;

    public JavaScriptInterface(Activity activiy) {
        this.activity = activiy;
    }

    @JavascriptInterface
    public String startVideo(){
        return "tutaj backend";
    }
}

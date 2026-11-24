package com.megroups.chit;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            WebView webView = new WebView(this);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            setContentView(webView);
            webView.loadUrl("file:///android_asset/index.html");
        } catch (Throwable e) {
            TextView tv = new TextView(this);
            tv.setText("Error: " + e.getMessage());
            setContentView(tv);
        }
    }
}

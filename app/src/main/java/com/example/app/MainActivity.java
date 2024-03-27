package com.example.app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView visorWeb;
    String url = "https://dderly.com/";
    SwipeRefreshLayout mySwipeRefreshLayout;
    final Context context= this;
    ValueCallback<Uri[]>upload;

    private final int MY_PERMISSION_REQUEST_READ_PHONE_STATE = 0;
    private final int MY_PERMISSION_REQUEST_READ_EXTERNAL_STORAGE = 0;
    private final int MY_PERMISSION_REQUEST_READ_CAMERA = 0;
    private static final String TAG = MainActivity.class.getSimpleName();
    public static final int INPUT_FILE_REQUEST_CODE = 1;
    private ValueCallback<Uri[]> mFilePatchCallback;
    private String mCameraPhotoPatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //RequestPermissions();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visorWeb = (WebView) findViewById(R.id.visorWeb);
        assert visorWeb != null;

        WebSettings webSettings = visorWeb.getSettings();
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);
        //visorWeb.getSettings().setJavaScriptEnabled(true);
        visorWeb.getSettings().setDatabaseEnabled(true);
        visorWeb.getSettings().setDomStorageEnabled(true);

        visorWeb.setVerticalScrollBarEnabled(false);
        visorWeb.setWebViewClient(new MyWeb());
        visorWeb.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, FileChooserParams fileChooserParams) {
                 super.onShowFileChooser(webView, filePathCallback, fileChooserParams);
                 Intent intent;
                 intent=fileChooserParams.createIntent();
                 upload=filePathCallback;
                 startActivityForResult(intent, 101);
                 return true;
            }
        });
        visorWeb.loadUrl(url);
    }

    private class MyWeb extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return  true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            findViewById(R.id.loaderWebview).setVisibility(View.GONE);
            findViewById(R.id.visorWeb).setVisibility(View.VISIBLE);
        }

//        @Override
//        public void OnPageStared(WebView view, String url, Bitmap favicon){
//            super.OnPageStared(view, url, favicon);
//        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==101) {
            if (upload==null)
                return;

            upload.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(resultCode,data));
            upload=null;
        }
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
       WebView visorWeb;
        visorWeb = (WebView) findViewById(R.id.visorWeb);
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (visorWeb.canGoBack()) {
                        visorWeb.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

}
package com.example.ljean.ggcintercom;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity  {

    private WebView wv1;
    private WebView wv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        wv1=(WebView)findViewById(R.id.webview1);
        wv1.setWebViewClient(new MyBrowser());

        String url ="https://www.ggc.edu";

        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.loadUrl(url);

    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            url = "https://www.ggc.edu";
            view.loadUrl(url);
            return true;
        }
    }

    public void Profile(View view)
    {
        Intent signIn = new Intent(MainActivity.this, Profile.class);
        startActivity(signIn);

    }

    public void Predash(View view)
    {
        Intent signIn = new Intent(MainActivity.this, Predash.class);
        startActivity(signIn);

    }


    public void Sign_up(View view)
    {
        Intent signUp = new Intent(MainActivity.this, Sign_up.class);
        startActivity(signUp);

    }

    //going to d2l website
    public void Browsed2l (View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fs.ggc.edu/adfs/ls/?SAMLRequest=fZFLb4MwEIT%2FCvIdbMiDYAUkmhwaKW1RoT30UjlgwBLY1GuS9t8XQh%2FpoTnv7Dezs2tgbdPRuDe1fORvPQdjvbeNBHoehKjXkioGAqhkLQdqcprGd3vqOYR2WhmVqwZZMQDXRii5URL6luuU66PI%2BdPjPkS1MR1QjKsqd46Cn5weKocXPU5rcTiohpvaAVB45Ho4eUgzZG2HIEKyEfkLKMEZGeMqK0rADWBk7bYhei3LGc%2F9IieuO2NBMCfEn7GCBLMVXy79ORlkAD3fSTBMmhB5xPVt4tneIiMBna%2Bot3hBVvJ1z42QhZDV9eMPkwjobZYl9pT6mWs4Jx4EKFqPFdKzsb4o9TqWfTeJon97g5%2FebOjW%2BMJm8uzo%2FcDdbRPViPzDiptGnTaaM8ND5CIcTSt%2Fvx59Ag%3D%3D&RelayState=https%3A%2F%2Fggc.view.usg.edu%2Fd2l%2FshibbolethSSO%2Flogin.d2l"));
        startActivity(browserIntent);
    }

    //going to banner website
    public void Browsebanner (View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://ggc.gabest.usg.edu/pls/B400/twbkwbis.P_WWWLogin"));
        startActivity(browserIntent);
    }

    //going to clawmail website
    public void Browseclawmail (View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://clawmail.ggc.edu"));
        startActivity(browserIntent);
    }

    //going to getInvolved website
    public void BrowseGetInv (View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://getinvolved.ggc.edu"));
        startActivity(browserIntent);
    }

}

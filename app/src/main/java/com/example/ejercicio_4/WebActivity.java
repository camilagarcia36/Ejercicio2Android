package com.example.ejercicio_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.net.URL;

public class WebActivity extends AppCompatActivity {
    TabLayout TabLay;
    ViewPager pages;
    Adapter adapter;

    String Url1;
    String Url2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Webs");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        //recive the Strings in Bundle and then send it to the other activity
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Url1 = bundle.getString("First Url", " ");
            Url2 = bundle.getString("Second Url", " ");
        }

        TabLay = findViewById(R.id.TabLay);

        pages = findViewById(R.id.ViewP);
        adapter = new Adapter(getSupportFragmentManager());
        pages.setAdapter(adapter);
        TabLay.setupWithViewPager(pages);
    }

    public String sendUrls(int i) {
        if (i == 1) {
            return Url1;
        } else {
            return Url2;
        }
    }
}
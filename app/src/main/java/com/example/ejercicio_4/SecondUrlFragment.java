package com.example.ejercicio_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondUrlFragment extends Fragment {
    String Url2;

    @Nullable
    @Override //Recive the content of the bundle in this case the URL
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        WebActivity activity = (WebActivity) getActivity();
        Url2 = activity.sendUrls(2);
        return inflater.inflate(R.layout.fragment_webs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        WebView webView = view.findViewById(R.id.WBfragment);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(Url2);
    }
}


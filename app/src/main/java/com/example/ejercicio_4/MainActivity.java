package com.example.ejercicio_4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    EditText ET1;
    EditText ET2;
    ProgressBar progressBar;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Webs");
        progressBar = findViewById(R.id.progressBar);
    }

    public void openWA(View view) {  //To apply OnClick
        Intent intent = new Intent(this, WebActivity.class); //To send information between activities.

        ET1 = findViewById(R.id.ET1);
        String Url1 = ET1.getText().toString();
        Log.d("EditText1", "ReciveET1 " + Url1);

        ET2 = findViewById(R.id.ET2);
        String Url2 = ET2.getText().toString();
        Log.d("EditText2", "ReciveET2 " + Url2); //get the content of edit text and save it in the String

        intent.putExtra("First Url", Url1);
        intent.putExtra("Second Url", Url2); //To send the information that is inside the String

        if (Url1.length() == 0 || Url2.length() == 0) {
            View view1 = findViewById(R.id.bMA);
            Snackbar.make(view1, "There are empty fields", 10000).show();
        } else {
            progress += 100;
            progressBar.setProgress(progress);
            startActivity(intent);
        }  //Here I made a conditional to verify the content of the EditText and to put the progressbar and fill it
    }
}
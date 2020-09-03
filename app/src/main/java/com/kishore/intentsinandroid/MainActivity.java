package com.kishore.intentsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText meditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        meditText=findViewById(R.id.et_url_input);
    }
//Explict Inten
    public void showSecondScreen(View view) {
        Intent intentObj=new Intent(this,secondActivity.class);
        startActivity(intentObj);
        String myUrl=meditText.getText().toString();
        Uri uri=Uri.parse("http://www."+myUrl+".com");
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
    //Implict Intent
    public void showwebPage(View view) {
        String myUrl=meditText.getText().toString();
        Uri uri=Uri.parse("http://www."+myUrl+".com");
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}
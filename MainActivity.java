package com.example.mpp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate creates an activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R describes the resources of the project

        //In Android R is an Java-class that is auto-generated from your resources by the build process
        //R.layout refers to a class called layout
        //The R.layout member is a auto-generated class that contains all IDs for layouts.
        //R.id tells the code to find an Android resource with that Id
    }
          //this method will be called upon button click
        public void onClick(View view) {
            TextView text = (TextView) findViewById(R.id.textView); //assigning the variable to the id , casting - name of the class you want to cast
            text.setText("Begin........."); //changing the text
            TextView btn = (Button) findViewById(R.id.button);
            btn.setText("Clicked");

    }
}

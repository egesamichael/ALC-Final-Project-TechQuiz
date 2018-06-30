package com.praisewebhosts.android.techquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.awt.font.TextAttribute;

public class Register extends Activity {

    public String user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    //Get the current User's Username

    public void getUser(View view) {

        EditText username = (EditText) findViewById(R.id.user);

        user = username.getText().toString();

        //  Create an Intent to go to the next Activity and pass the users name

        Intent goHome = new Intent(this, MainActivity.class);
        goHome.putExtra("gotUser", user);

        startActivity(goHome);
    }


}

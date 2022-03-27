package com.shashank.platform.furnitureecommerceappui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button login;


    Button b1;
    EditText e1,e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.ee2);

        b1 = findViewById(R.id.login);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!e1.getText().toString().equals("")&&!e2.getText().toString().equals("")){

                    Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(i);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Fill the fields",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

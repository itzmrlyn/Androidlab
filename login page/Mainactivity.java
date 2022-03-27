package com.example.loginpage;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
EditText username;
EditText password;
Button button;
String name = "admin";
String ps = "1234";
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
username = findViewById(R.id.username);
password = findViewById(R.id.password);

3
button = findViewById(R.id.login);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
String inpName = username.getText().toString();
String inppass = password.getText().toString();
if (inpName.isEmpty() || inppass.isEmpty()){
Toast.makeText(MainActivity.this,"Fields are
empty",Toast.LENGTH_SHORT).show();
}else{
if (inpName.equals(name) && inppass.equals(ps)) {
Toast.makeText(MainActivity.this, "success",
Toast.LENGTH_SHORT).show();
}else{
Toast.makeText(MainActivity.this,"incorrect",Toast.LENGTH_SHORT).show();
}
}
}
}
);
}
}

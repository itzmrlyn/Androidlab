public class MainActivity extends AppCompatActivity {
private EditText name, age,phone,pass;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
name = findViewById(R.id.name);
age = findViewById(R.id.age);
phone= findViewById(R.id.phone);
pass= findViewById(R.id.pass);
}
@Override
protected void onResume() {
super.onResume();
SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
String s1 = sh.getString("name", "");
int a = sh.getInt("age", 0);
int pn=sh.getInt("phone number",0);
String pw=sh.getString("password","");
name.setText(s1);
age.setText(String.valueOf(a));
phone.setText(String.valueOf(pn));
pass.setText(pw);
}
@Override
protected void onPause() {
super.onPause();
SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",
MODE_PRIVATE);
SharedPreferences.Editor myEdit = sharedPreferences.edit();
myEdit.putString("name", name.getText().toString());
myEdit.putInt("age", Integer.parseInt(age.getText().toString()));
myEdit.putInt("phone number",Integer.parseInt(phone.getText().toString()));
myEdit.putString("password", pass.getText().toString());
myEdit.apply();
}
}

public class intent extends AppCompatActivity {
Button button;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);

33
setContentView(R.layout.activity_intent);
button=findViewById(R.id.button2);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Intent i=new Intent(getApplicationContext(),MainActivity.class);
startActivity(i);
}
});
}
}

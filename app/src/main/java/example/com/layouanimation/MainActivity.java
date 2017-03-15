package example.com.layouanimation;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg= (RadioGroup) findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case R.id.rb1:
                break;
            case R.id.rb2:
                break;
            case R.id.rb3:
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                break;
            case R.id.rb4:
                Intent intent1=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent1);
                break;
        }
    }
}

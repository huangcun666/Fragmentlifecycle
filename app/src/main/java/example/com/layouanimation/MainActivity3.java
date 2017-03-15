package example.com.layouanimation;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Adminstrator on 2017/1/21.
 */

public class MainActivity3 extends AppCompatActivity implements Myfragment3.Mlisten{
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editText= (EditText) findViewById(R.id.edit);
        button= (Button) findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String text= editText.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("na",text);
                Myfragment3 myfragment3=new Myfragment3();
                myfragment3.setArguments(bundle);
                FragmentManager fragmentManager=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.layout,myfragment3);
                fragmentTransaction.commit();
                Toast.makeText(MainActivity3.this,"向Myfragment发送信息",Toast.LENGTH_SHORT).show();
                Fragment fragment=fragmentManager.findFragmentById(R.id.frag);
                MyFragment1 fragment1= (MyFragment1) fragment;
                fragment1.setAa("ddddd");
            }
        });
    }

    @Override
    public void thank(String code) {
            Toast.makeText(MainActivity3.this,"接收到Myfragment3发送的信息"+code,Toast.LENGTH_SHORT).show();
    }
   /* FragmentManager fragmentManager=getSupportFragmentManager();
    Fragment fragment=fragmentManager.findFragmentById(R.id.frag);
    MyFragment1 fragment1= (MyFragment1) fragment;
    public void setFragment1(MyFragment1 frag) {
        this.fragment1 = frag;
        fragment1.setAa("1111");
    }*/

}

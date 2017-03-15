package example.com.layouanimation;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Adminstrator on 2017/1/19.
 */

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private Boolean flag=true;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
         button= (Button) findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                if(flag){
                    Myfragment2 myfragment2=new Myfragment2();
                    fragmentTransaction.replace(R.id.layout,myfragment2);
                    fragmentTransaction.commit();
                    flag=false;
                }
                else {
                    MyFragment1 myFragment1=new MyFragment1();
                    fragmentTransaction.replace(R.id.layout,myFragment1);
                    fragmentTransaction.commit();
                    flag=true;

                }
            }
        });
    }
    private void init(){
        FragmentManager fragmentManager=getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        MyFragment1 myFragment1=new MyFragment1();
        fragmentTransaction.add(R.id.layout,myFragment1);
        fragmentTransaction.commit();

    }
}

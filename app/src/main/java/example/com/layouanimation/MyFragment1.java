package example.com.layouanimation;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Adminstrator on 2017/1/19.
 */

public class MyFragment1 extends Fragment {
    @Nullable
    private TextView tv;
    private String aa;
    private Button but;

    public String getAa() {
        return aa;
    }

    public void setAa(String a) {
        this.aa = a;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1,container,false);
        tv= (TextView) view.findViewById(R.id.tv);
        tv.setText("第一个的Fragment");
        Log.i("Main","Fragment1-onCreateView");
        but= (Button) view.findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String values=getAa();
                Toast.makeText(getActivity(),"接收到Mainactivity3的信息"+values,Toast.LENGTH_SHORT).show();
            }
        });
                return view;
    }

   /* @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("Main","Fragment-onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Main","Fragment-oncreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Main","Fragment-onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Main","Fragment-onstart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Main","Fragment-onResume");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Main","Fragment-onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Main","Fragment-onpause");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Main","Fragment-onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Main","Fragment-ondestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Main","Fragment-ondetach");
    }*/
}

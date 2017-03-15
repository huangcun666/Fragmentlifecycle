package example.com.layouanimation;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Adminstrator on 2017/1/19.
 */

public class Myfragment2 extends Fragment {
    private TextView tv;
    @Override
    /*每次创建都会绘制Fragment的View组件都会回调该方法
    * */
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2,container,false);
        tv= (TextView) view.findViewById(R.id.tv);
        tv.setText("第二个Fragment");
        Log.i("Main","Fragment1-onCreateView");
        return view;
    }
/*当Fragment被添加加到Activity时候会回调这个方法
*
* */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("Main","Fragment-onAttach");
    }
/*创建Fragment时会回调，只回掉一次
* */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Main","Fragment-oncreate");
    }
/*
* 当Fragment所在的Activity启动完成后调用
* */
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
    }
}

package example.com.layouanimation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Adminstrator on 2017/1/21.
 */

public class Myfragment3 extends Fragment {
    @Nullable
    private TextView textView;
    private  String code="THANK YOU";
    public Mlisten mlisten;
    public interface Mlisten{
        public void thank(String code);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2,container,false);
        textView= (TextView) view.findViewById(R.id.tv);
       String text= (String) getArguments().get("na");
        textView.setText(text);
        Toast.makeText(getActivity(), "MyFragment3接收到信息", Toast.LENGTH_SHORT).show();
        Toast.makeText(getActivity(),"向MainActivity3发送信息",Toast.LENGTH_SHORT).show();
        mlisten.thank(code);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        mlisten= (Mlisten) activity;
        super.onAttach(activity);

    }
}

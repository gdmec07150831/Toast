package cn.edu.gdmec.s07150831.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1(View v){
        Toast.makeText(this,"原来是这个啊，会了",Toast.LENGTH_SHORT).show();
    }
    public void b2(View v){
        //LayoutInflater lf = (LayoutInflater) getSystemService(Context.LOCATION_SERVICE);
        //LayoutInflater lf = LayoutInflater.from(this);
        LayoutInflater lf = getLayoutInflater();
        View vroot = lf.inflate(R.layout.toastinfo,null);
        Toast toast = new Toast(this);
        toast.setView(vroot);
        toast.show();
    }
    public void b3(View v){
        Toast toast = Toast.makeText(this,"I am 小黄人--图文显示",Toast.LENGTH_SHORT);
        LinearLayout ll =  new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView mImage = new ImageView(this);
        mImage.setImageResource(R.drawable.yellowman);
        View toastView = toast.getView();   //获取显示文字的Toast View
        ll.addView(mImage);
        ll.addView(toastView);
        toast.setView(ll);
        toast.show();
    }
}

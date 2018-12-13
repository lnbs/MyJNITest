package com.sdd.client.myjnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sdd.client.myjnitest.jni.MyJNIUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyJNIUtil myJNIUtil=new MyJNIUtil();
        String myName = myJNIUtil.getMyName();
        TextView test = findViewById(R.id.tv_test);
        test.setText(myName);
    }
}

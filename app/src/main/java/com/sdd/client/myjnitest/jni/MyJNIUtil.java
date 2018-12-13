package com.sdd.client.myjnitest.jni;

public class MyJNIUtil {
    static {
        System.loadLibrary("MyTest");
    }
    public native String getMyName();
}

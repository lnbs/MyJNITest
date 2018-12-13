//
// Created by admin on 2018-12-13.
//
#include <jni.h>
#include <com_sdd_client_myjnitest_jni_MyJNIUtil.h>

JNIEXPORT jstring JNICALL Java_com_sdd_client_myjnitest_jni_MyJNIUtil_getMyName
  (JNIEnv * env, jobject obj){
    return (*env)->NewStringUTF(env, "Hello from JNI !");
  }

//
// Created by Everspin on 2020/10/29.
//

#include "adb_log.h"

extern "C" jboolean JNICALL
__attribute((__annotate__(("split_num=3"))))
Java_com_example_esblue_JNIBase_00024Companion_initJNI(JNIEnv *env, jobject thiz) {
    // TODO: implement initJNI()
    return true;
}

extern "C"
JNIEXPORT jint JNICALL
__attribute((__annotate__(("split_num=3"))))
Java_com_example_esblue_JNIBase_00024Companion_addFunc(JNIEnv *env, jobject thiz, jint a, jint b) {
    // TODO: implement addFunc()
    //LOGD("%d + %d = %d", a, b, a+b);
    return a+b;
}

extern "C"
JNIEXPORT jboolean JNICALL
__attribute((__annotate__(("split_num=3"))))
Java_com_example_esblue_JNIBase_00024Companion_finJNI(JNIEnv *env, jobject thiz) {
    // TODO: implement finJNI()
    return true;
}
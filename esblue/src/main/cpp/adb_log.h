//
// Created by 정순용 on 2020/10/21.
//

#ifndef LIBTESTAPP_ADB_LOG_H
#define LIBTESTAPP_ADB_LOG_H
#include <jni.h>
#include <string>
#include <android/log.h>

#ifndef LOG_TAG
#define LOG_TAG "es-native"
#endif
#define LOGV(...) __android_log_print(ANDROID_LOG_VERBOSE, LOG_TAG, __VA_ARGS__)
//#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG , LOG_TAG, __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO , LOG_TAG, __VA_ARGS__)
#define LOGW(...) __android_log_print(ANDROID_LOG_WARN , LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR , LOG_TAG, __VA_ARGS__)

template <typename T>
void print_log(const T* msg)
{
    //LOGD("%s\n", (const char*)msg);
}

void print_string(const char* msg)
{
    //LOGD("%s\n", (const char*)msg);
}


#endif //LIBTESTAPP_ADB_LOG_H

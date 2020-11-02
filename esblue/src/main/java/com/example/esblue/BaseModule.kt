package com.example.esblue

class JNIBase {
    companion object {
        init {
            System.loadLibrary("esblue-native")
        }
        private external fun initJNI(): Boolean
        private external fun addFunc(a: Int, b: Int): Int
        private external fun finJNI(): Boolean

        fun libraryTest(a: Int, b: Int): Int {
            initJNI()
            println("Hello library?")
            var x = addFunc(a, b)
            finJNI()
            return x
        }

        @JvmStatic
        fun function4jni(arg:String):Int {
            println("message from jni: $arg")
            return 1004;
        }
    }
}

fun OuterFun():String {
    println("I'm Outer Function")
    return "bye-bye"
}
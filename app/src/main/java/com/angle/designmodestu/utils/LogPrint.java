package com.angle.designmodestu.utils;

import android.util.Log;

/**
 * 作者    angle
 * 时间    2019-12-16 10:39
 * 文件    liaoningZH
 * 描述    日志输出控制
 */
public class LogPrint {
    public static final String TAG = "LogPrint";
    public static final boolean isPrint = true;

    public static void print(String msg){
        i(TAG,msg);
    }

    public static void d(String tag, String msg){
        if (isPrint){
            Log.d(tag,msg);
        }
    }
    public static void e(String tag, String msg){
        if (isPrint){
            Log.d(tag,msg);
        }
    }
    public static void i(String tag, String msg){
        if (isPrint){
            Log.d(tag,msg);
        }
    }
}

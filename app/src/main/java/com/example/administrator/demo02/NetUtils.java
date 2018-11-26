package com.example.administrator.demo02;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by fyl on 2018/9/13 0013.
 */

public class NetUtils {

    /**
     * 判断网络是否连接
     * @param context
     * @return
     */
    public static boolean isConnected(Context context){
        ConnectivityManager connectivityManager= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(null!=connectivityManager){
            NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();
            if (null!=networkInfo&&networkInfo.isConnected()){
                if (networkInfo.getState()==NetworkInfo.State.CONNECTED){
                    return true;
                }
            }
        }
        return false;
    }

}

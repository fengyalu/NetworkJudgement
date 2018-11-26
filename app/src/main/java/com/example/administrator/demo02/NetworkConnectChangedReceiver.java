package com.example.administrator.demo02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by fyl on 2018/9/13 0013.
 */

public class NetworkConnectChangedReceiver extends BroadcastReceiver {
    private static final String TAG = "NetworkConnectChangedRe";

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isConnected = NetUtils.isConnected(context);
        Log.d(TAG, "onReceive: "+isConnected);
        EventBus.getDefault().post(new NetworkChangeEvent(true));
    }
}

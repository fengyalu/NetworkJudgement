package com.example.administrator.demo02;

/**
 * Created by fyl on 2018/9/13 0013.
 */

public class NetworkChangeEvent {
    public boolean isConnected;//是否存在网络

    public NetworkChangeEvent(boolean isConnected) {
        this.isConnected = isConnected;
    }
}
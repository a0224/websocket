package com.bao8.websocket;

import com.bao8.websocket.dispatcher.IResponseDispatcher;
import com.bao8.websocket.dispatcher.ResponseDelivery;

import org.java_websocket.framing.Framedata;

/**
 * 一个简单的 WebSocket 消息分发器，实现了 {@link IResponseDispatcher} 接口，
 * 因为 IResponseDispatcher 中的方法比较多，所以在此提供了一个简单版本，
 * 只需要实现其中主要的几个方法即可。
 */
public abstract class SimpleDispatcher implements IResponseDispatcher {

    @Override
    public void onConnected(ResponseDelivery delivery) {
        if (delivery != null) {
            delivery.onConnected();
        }
    }

    @Override
    public void onConnectFailed(Throwable cause, ResponseDelivery delivery) {
        if (delivery != null) {
            delivery.onConnectFailed(cause);
        }
    }

    @Override
    public void onDisconnect(ResponseDelivery delivery) {
        if (delivery != null) {
            delivery.onDisconnect();
        }
    }

    @Override
    public void onMessage(String message, ResponseDelivery delivery) {
        if (delivery != null) {
            delivery.onMessage(message, null);
        }
    }

    @Override
    public void onPing(Framedata framedata, ResponseDelivery delivery) {
        if (delivery != null) {
            delivery.onPing(framedata);
        }
    }

    @Override
    public void onPong(Framedata framedata, ResponseDelivery delivery) {
        if (delivery != null) {
            delivery.onPong(framedata);
        }
    }

}

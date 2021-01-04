package com.bao8.websocket.request;

import com.bao8.websocket.util.LogUtil;

import org.java_websocket.client.WebSocketClient;

/**
 * 发送 Ping
 */
public class PingRequest implements Request<Object> {

    PingRequest() {
    }

    @Override
    public void setRequestData(Object data) {

    }

    @Override
    public Object getRequestData() {
        return null;
    }

    @Override
    public void send(WebSocketClient client) {
        client.sendPing();
        LogUtil.e("WebSocket-Ping", "sendPing");
    }

    @Override
    public void release() {
        RequestFactory.releasePingRequest(this);
    }
}

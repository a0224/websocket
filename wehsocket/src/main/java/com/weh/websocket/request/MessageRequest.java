package com.weh.websocket.request;

import com.weh.websocket.bean.Bao8Message;

import org.java_websocket.client.WebSocketClient;

/**
 * byte[] 类型的请求
 */
public class MessageRequest implements Request<Bao8Message> {

    MessageRequest() {
    }

    private Bao8Message data;

    @Override
    public void setRequestData(Bao8Message data) {
        this.data = data;
    }

    @Override
    public Bao8Message getRequestData() {
        return this.data;
    }

    @Override
    public void send(WebSocketClient client) {
        client.send(this.data.data);
    }

    @Override
    public void release() {
        RequestFactory.releaseMessageRequest(this);
    }

    @Override
    public String toString() {
        return String.format("[@MessageRequest%s,%s]",
                hashCode(),
                data == null ?
                        "data:null" :
                        "data:" + data.toString());
    }
}

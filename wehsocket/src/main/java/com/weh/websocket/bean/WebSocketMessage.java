package com.weh.websocket.bean;

public class WebSocketMessage {
    public long id;
    public byte[] data;

    public WebSocketMessage(long id, byte[] data) {
        this.id = id;
        this.data = data;
    }
}

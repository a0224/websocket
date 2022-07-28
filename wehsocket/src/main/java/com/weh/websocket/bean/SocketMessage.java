package com.weh.websocket.bean;

public class SocketMessage {
    public long id;
    public byte[] data;

    public SocketMessage(long id, byte[] data) {
        this.id = id;
        this.data = data;
    }
}

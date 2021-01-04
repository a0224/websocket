package com.bao8.websocket.bean;

/**
 * Created by wanghao 2021/1/4 14:52
 */
public class Bao8Message {
    public long id;
    public byte[] data;

    public Bao8Message(long id, byte[] data) {
        this.id = id;
        this.data = data;
    }
}

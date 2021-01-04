package com.bao8.websocket.dispatcher;

import com.bao8.websocket.SocketListener;

/**
 * 消息发射器接口
 */
public interface ResponseDelivery extends SocketListener {

    void addListener(SocketListener listener);

    void removeListener(SocketListener listener);

    void clear();

    boolean isEmpty();
}

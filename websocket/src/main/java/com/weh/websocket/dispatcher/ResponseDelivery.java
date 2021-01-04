package com.weh.websocket.dispatcher;

import com.weh.websocket.SocketListener;

/**
 * 消息发射器接口
 */
public interface ResponseDelivery extends SocketListener {

    void addListener(SocketListener listener);

    void removeListener(SocketListener listener);

    void clear();

    boolean isEmpty();
}

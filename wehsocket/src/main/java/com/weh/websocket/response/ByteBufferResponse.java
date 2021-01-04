package com.weh.websocket.response;

import com.weh.websocket.dispatcher.IResponseDispatcher;
import com.weh.websocket.dispatcher.ResponseDelivery;

import java.nio.ByteBuffer;

/**
 * 接收到二进制数据
 */
public class ByteBufferResponse implements Response<ByteBuffer> {

    private ByteBuffer data;

    ByteBufferResponse() {
    }

    @Override
    public ByteBuffer getResponseData() {
        return data;
    }

    @Override
    public void setResponseData(ByteBuffer responseData) {
        this.data = responseData;
    }

    @Override
    public void onResponse(IResponseDispatcher dispatcher, ResponseDelivery delivery) {
        dispatcher.onMessage(data, delivery);
        release();
    }

    @Override
    public String toString() {
        return String.format("[@ByteBufferResponse%s->ByteBuffer:%s]",
                hashCode(),
                data == null ?
                        "null" :
                        data.toString());
    }

    @Override
    public void release() {
        ResponseFactory.releaseByteBufferResponse(this);
    }
}

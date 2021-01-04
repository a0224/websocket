package com.weh.websocket.response;

import com.weh.websocket.dispatcher.IResponseDispatcher;
import com.weh.websocket.dispatcher.ResponseDelivery;

/**
 * WebSocket 响应数据接口
 */
public interface Response<T> {

    /**
     * 获取响应的数据
     */
    T getResponseData();

    /**
     * 设置响应的数据
     */
    void setResponseData(T responseData);

    void onResponse(IResponseDispatcher dispatcher, ResponseDelivery delivery);

    /**
     * 回收资源
     */
    void release();
}

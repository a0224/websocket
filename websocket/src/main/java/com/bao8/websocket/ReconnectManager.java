package com.bao8.websocket;

/**
 * 重连接口
 */
public interface ReconnectManager {

    /**
     * 是否正在重连
     */
    boolean reconnecting();

    /**
     * 开始重连
     */
    void startReconnect();

    /**
     * 停止重连
     */
    void stopReconnect();

    /**
     * 连接成功
     */
    void onConnected();

    /**
     * 连接失败
     *
     * @param th 失败原因
     */
    void onConnectError(Throwable th);

    /**
     * 销毁资源
     */
    void destroy();

    /**
     * 连接成功或失败事件
     */
    interface OnConnectListener {
        void onConnected();

        void onDisconnect();
    }
}

package com.asterisk.opensource.spider.queue;

/**
 * @author donghao
 * @Date 17/1/7
 * @Time 上午11:26
 */
public class RedisMessageQueue implements MessageQueue{


    @Override
    public QueueProvider queueName() {
        return QueueProvider.REDIS;
    }

    @Override
    public <T> T consume() {
        return null;
    }

    @Override
    public <T> void provide(T data) {

    }
}

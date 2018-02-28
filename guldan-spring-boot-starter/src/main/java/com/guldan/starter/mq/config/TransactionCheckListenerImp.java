package com.guldan.starter.mq.config;

import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.TransactionCheckListener;
import org.apache.rocketmq.common.message.MessageExt;

/**
 * Created by windy on 2017/8/1.
 */
public class TransactionCheckListenerImp implements TransactionCheckListener {
    @Override
    public LocalTransactionState checkLocalTransactionState(MessageExt messageExt) {

        System.out.printf("server checking transactionMsg"+messageExt.toString());
        return LocalTransactionState.COMMIT_MESSAGE;
    }
}

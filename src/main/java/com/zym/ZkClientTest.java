package com.zym;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

public class ZkClientTest {

    public static void main(String[] args) throws Exception {

        BalanceServer balanceServer = BalanceServer.getInstance();

        balanceServer.register("8081");

        balanceServer.register("8082");

        Thread.sleep(20000);
    }

}

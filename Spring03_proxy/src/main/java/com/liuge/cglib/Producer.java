package com.liuge.cglib;

import com.liuge.proxy.IProducer;

/**
 * @ClassName: Producer
 * @Description: 一个生产者
 * @author: LiuGe
 * @date: 2020/4/30  22:05
 */
public class Producer {
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money){
        System.out.println("销售产品,并拿到钱 -->"+money);
    }

    /**
     * 售后
     * @param money
     */
    public void afterService(float money){
        System.out.println("提供售后服务,并拿到钱 -->"+money);
    }
}

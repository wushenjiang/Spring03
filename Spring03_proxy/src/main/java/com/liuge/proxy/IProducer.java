package com.liuge.proxy;

/**
 * @ClassName: IProducer
 * @Description: 对生产厂家要求的接口
 * @author: LiuGe
 * @date: 2020/4/30  22:23
 */
public interface IProducer {
    /**
     * 销售
     * @param money
     */
    void saleProduct(float money);

    /**
     * 售后
     * @param money
     */
    void afterService(float money);
}

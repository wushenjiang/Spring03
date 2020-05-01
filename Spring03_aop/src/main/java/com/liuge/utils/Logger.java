package com.liuge.utils;

/**
 * @ClassName: Logger
 * @Description: 用于生成日志的工具类,它里面提供了公共的代码
 * @author: LiuGe
 * @date: 2020/5/1  21:50
 */
public class Logger {
    /**
     * 用于打印日志:计划让其在切入点方法执行之前执行(切入点方法就是业务层方法)
     */
    public void printLog(){
        System.out.println("Logger类中的printLog类方法开始记录日志了....");
    }
}

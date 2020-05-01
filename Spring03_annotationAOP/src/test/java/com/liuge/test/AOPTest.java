package com.liuge.test;

import com.liuge.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: AOPTest
 * @Description: 测试AOP的配置
 * @author: LiuGe
 * @date: 2020/5/1  22:03
 */
public class AOPTest {
    public static void main(String[] args) {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        //3.执行方法
        as.saveAccount();
    }
}

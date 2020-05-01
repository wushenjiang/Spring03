package com.liuge.service.impl;

import com.liuge.service.IAccountService;

/**
 * @ClassName: AccountServiceImpl
 * @Description: TODO
 * @author: LiuGe
 * @date: 2020/5/1  21:49
 */
public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("执行了保存");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("执行了更新"+i);
    }

    @Override
    public int deleteAccount() {
        System.out.println("执行了删除");
        return 0;
    }
}

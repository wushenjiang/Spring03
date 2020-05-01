package com.liuge.service;

/**
 * @ClassName: IAccountService
 * @Description: 账户的业务层接口
 * @author: LiuGe
 * @date: 2020/5/1  21:47
 */
public interface IAccountService {
    /**
     * 模拟保存账户
     */
    void saveAccount();

    /**
     * 模拟更新账户
     * @param i
     */
    void updateAccount(int i);

    /**
     * 删除账户
     * @return
     */
    int deleteAccount();
}

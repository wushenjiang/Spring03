package com.liuge.service;

import com.liuge.domain.Account;

import java.util.List;

/**
 * @ClassName: IAccountService
 * @Description: 账户的业务层接口
 * @author: LiuGe
 * @date: 2020/4/30  0:44
 */
public interface IAccountService {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询一个
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 保存操作
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param accountId
     */
    void deleteAccount(Integer accountId);

    /**
     * 转账
     * @param sourceName 转出账户名称
     * @param target 转入账户名称
     * @param money 转账金额
     */
    void transfer(String sourceName,String target,Float money);
}

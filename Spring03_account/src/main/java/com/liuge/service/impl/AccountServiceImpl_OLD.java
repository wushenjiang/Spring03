package com.liuge.service.impl;

import com.liuge.dao.IAccountDao;
import com.liuge.domain.Account;
import com.liuge.service.IAccountService;
import com.liuge.utils.TransactionManager;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AccountServiceImpl
 * @Description: 账户的业务层实现类
 * @author: LiuGe
 * @date: 2020/4/30  0:48
 * 事务都应都在业务层
 */
@Service("accountService")
public class AccountServiceImpl_OLD implements IAccountService {
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    private TransactionManager tsManager;

    public void setTsManager(TransactionManager tsManager) {
        this.tsManager = tsManager;
    }

    @Override
    public List<Account> findAllAccount() {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            List<Account> accounts = accountDao.findAllAccount();
            //3.提交事务
            tsManager.commit();
            //4.返回结果
            return accounts;
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //6.归还连接
            tsManager.release();
        }

    }

    @Override
    public Account findAccountById(Integer accountId) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            Account account = accountDao.findAccountById(accountId);
            //3.提交事务
            tsManager.commit();
            //4.返回结果
            return account;
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
            throw new RuntimeException(e);
        }finally {
            //6.归还连接
            tsManager.release();
        }
    }

    @Override
    public void saveAccount(Account account) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            accountDao.saveAccount(account);
            //3.提交事务
            tsManager.commit();
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
        }finally {
            //6.归还连接
            tsManager.release();
        }

    }

    @Override
    public void updateAccount(Account account) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            accountDao.updateAccount(account);
            //3.提交事务
            tsManager.commit();
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
        }finally {
            //6.归还连接
            tsManager.release();
        }

    }

    @Override
    public void deleteAccount(Integer accountId) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            accountDao.deleteAccount(accountId);
            //3.提交事务
            tsManager.commit();
        }catch (Exception e){
            //5.回滚操作
            tsManager.rollback();
        }finally {
            //6.归还连接
            tsManager.release();
        }

    }

    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        try {
            //1.开启事务
            tsManager.beginTransaction();
            //2.执行操作
            //2.1.根据名称查询转出账户
            Account source = accountDao.findAccountByName(sourceName);
            //2.2.根据名称查询转入账户
            Account target = accountDao.findAccountByName(targetName);
            //2.3.转出账户减钱
            source.setMoney(source.getMoney()-money);
            //2.4.转入账户加钱
            target.setMoney(target.getMoney()+money);
            //2.5.更新转出账户
            accountDao.updateAccount(source);
            
            int i=1/0;
            //2.6.更新转入账户
            accountDao.updateAccount(target);
            //3.提交事务
            tsManager.commit();
        }catch (Exception e){
            //4.回滚操作
            tsManager.rollback();
            e.printStackTrace();
        }finally {
            //5.归还连接
            tsManager.release();
        }

    }
}

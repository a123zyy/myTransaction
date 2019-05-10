package com.lt.tansaction.service.Impl;

import com.lt.tansaction.TransactionManager;
import com.lt.tansaction.Transation;
import com.lt.tansaction.dao.UserDao;
import com.lt.tansaction.entity.User;
import com.lt.tansaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Auther: 鸡蛋赶奶牛
 * @Date: 2019-05-05 14:50
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TransactionManager transactionManager;


    public void add(User user) {
        TransactionStatus begin = transactionManager.begin();
        try {
            System.out.println("add will be do ");
            user = new User("JdbcTemplet","JdbcTemplet");

            userDao.add(user);
            int i = 1 / 0;
            userDao.add(user);
            System.out.println("add over!");
            transactionManager.commit(begin);
        } catch (Exception e) {
            e.printStackTrace();
            transactionManager.callBack(begin);
        }
    }

    @Transation
    public void add2(User user) {
            System.out.println("add will be do ");
            user = new User("JdbcTemplet","JdbcTemplet");
            userDao.add(user);
            int i = 1 / 0;
            userDao.add(user);
            System.out.println("add over!");
    }


}

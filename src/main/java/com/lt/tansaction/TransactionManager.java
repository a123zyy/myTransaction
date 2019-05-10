package com.lt.tansaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;

/**
 * @ClassName: TransactionManager
 * @Description: TODO
 * @Auther: 鸡蛋赶奶牛
 * @Date: 2019-05-09 16:17
 * @Version: 1.0
 */
@Component
public class TransactionManager {


    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;


    /**
     * 开启事务
     */
    public TransactionStatus begin(){
        System.out.println(">>> begin");
        TransactionStatus transaction = dataSourceTransactionManager.getTransaction(new DefaultTransactionAttribute());
        return transaction;
    }


    /**
     * 提交事务
     */
    public void commit(TransactionStatus transaction){
        System.out.println(">>> commit");
        dataSourceTransactionManager.commit(transaction);
    }

    public void callBack(TransactionStatus transaction){
        System.out.println(">>> roll back ");
        dataSourceTransactionManager.rollback(transaction);
    }


}

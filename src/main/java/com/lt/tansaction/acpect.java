package com.lt.tansaction;

import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;

/**
 * @ClassName: acpect
 * @Description: TODO
 * @Auther: 鸡蛋赶奶牛
 * @Date: 2019-05-09 16:35
 * @Version: 1.0
 */
@Aspect
@Component
public class acpect {

    @Autowired
    private TransactionManager transactionManager;

    private TransactionStatus transaction;

    @Pointcut("@annotation(Transation)")
    public void perMethod(){

    }


    @Before("perMethod()")
    public void before(){
        transaction = transactionManager.begin();
    }

    @After("perMethod()")
    public void after(){
        transactionManager.commit(transaction);
    }

    @AfterThrowing("perMethod()")
    public void AfterThrowing(){
        transactionManager.commit(transaction);
    }






}

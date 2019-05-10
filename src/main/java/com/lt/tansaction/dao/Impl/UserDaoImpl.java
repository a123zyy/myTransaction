package com.lt.tansaction.dao.Impl;

import com.lt.tansaction.dao.UserDao;
import com.lt.tansaction.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserDaoImpl
 * @Description: TODO
 * @Auther: 鸡蛋赶奶牛
 * @Date: 2019-05-05 14:48
 * @Version: 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(User user) {
        String sql = "INSERT INTO mybatis.t_user (name, cal) VALUES (?, ?);";
        jdbcTemplate.update(sql,user.getName(),user.getCal());
    }



}

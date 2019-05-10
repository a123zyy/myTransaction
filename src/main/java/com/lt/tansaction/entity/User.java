package com.lt.tansaction.entity;

/**
 * @ClassName: User
 * @Description: TODO
 * @Auther: 鸡蛋赶奶牛
 * @Date: 2019-05-05 14:51
 * @Version: 1.0
 */
public class User {
    private Long oid;
    private String name;
    private String cal;

    public User() {
    }

    public User(String name, String cal) {
        this.name = name;
        this.cal = cal;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCal() {
        return cal;
    }

    public void setCal(String cal) {
        this.cal = cal;
    }
}

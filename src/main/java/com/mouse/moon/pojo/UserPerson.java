package com.mouse.moon.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user_person")
public class UserPerson {
    /**
     * 用户编号（sysid+时间戳+随机数；凑齐19位）
     */
    @Id
    private Long userid;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 第三方账号
     */
    @Column(name = "third_uid")
    private String thirdUid;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户真是姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 性别（0未设置、1 男、2 女）
     */
    private Byte gender;

    /**
     * 获取用户编号（sysid+时间戳+随机数；凑齐19位）
     *
     * @return userid - 用户编号（sysid+时间戳+随机数；凑齐19位）
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置用户编号（sysid+时间戳+随机数；凑齐19位）
     *
     * @param userid 用户编号（sysid+时间戳+随机数；凑齐19位）
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取第三方账号
     *
     * @return third_uid - 第三方账号
     */
    public String getThirdUid() {
        return thirdUid;
    }

    /**
     * 设置第三方账号
     *
     * @param thirdUid 第三方账号
     */
    public void setThirdUid(String thirdUid) {
        this.thirdUid = thirdUid;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取邮箱地址
     *
     * @return email - 邮箱地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱地址
     *
     * @param email 邮箱地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取用户真是姓名
     *
     * @return real_name - 用户真是姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置用户真是姓名
     *
     * @param realName 用户真是姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取性别（0未设置、1 男、2 女）
     *
     * @return gender - 性别（0未设置、1 男、2 女）
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置性别（0未设置、1 男、2 女）
     *
     * @param gender 性别（0未设置、1 男、2 女）
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }


}
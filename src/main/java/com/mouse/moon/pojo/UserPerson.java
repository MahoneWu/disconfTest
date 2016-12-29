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
     * 0:无证件，1:身份证
     */
    @Column(name = "card_type")
    private Short cardType;

    /**
     * 证件号码
     */
    @Column(name = "card_no")
    private String cardNo;

    /**
     * 支付宝账号
     */
    private String alipay;

    /**
     * 10为优易充app；20:e充网30:桩先生
     */
    @Column(name = "reg_source")
    private Short regSource;

    /**
     * 社交账号
     */
    private String qq;

    /**
     * 地级市
     */
    private String city;

    /**
     * 省份
     */
    private String province;

    /**
     * 联系地址
     */
    private String addr;

    private String community;

    private Boolean deleted;

    /**
     * 是否被锁定
     */
    private Boolean locked;

    /**
     * 用户等级
     */
    @Column(name = "user_level")
    private Integer userLevel;

    /**
     * 0：未认证，1：认证中：2：认证通过3：认证失败
     */
    @Column(name = "user_integral")
    private Integer userIntegral;

    /**
     * 是否认证
     */
    @Column(name = "auth_status")
    private Byte authStatus;

    /**
     * 用户大类，默认为1不要修改
     */
    @Column(name = "user_class")
    private Byte userClass;

    /**
     * 拥有车型（多个用分号[;]分隔）
     */
    @Column(name = "car_owned")
    private String carOwned;

    /**
     * 用户类型（1:私人用户；2普通用户）
     */
    @Column(name = "user_type")
    private String userType;

    /**
     * 绑定的第三方账户类型，3：微信，4qq
     */
    @Column(name = "bind_type")
    private Integer bindType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 用户头像，私人用户才有
     */
    @Column(name = "avatar_url")
    private String avatarUrl;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 百度钱包协议号
     */
    @Column(name = "contract_no")
    private String contractNo;

    /**
     * 是否已经签约
     */
    @Column(name = "contract_flag")
    private Boolean contractFlag;

    /**
     * 支付姓名
     */
    @Column(name = "alipay_name")
    private String alipayName;

    /**
     * 充电币
     */
    @Column(name = "charging_coins")
    private BigDecimal chargingCoins;

    /**
     * 支付宝账号（消费）
     */
    @Column(name = "alipay_account")
    private String alipayAccount;

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

    /**
     * 获取0:无证件，1:身份证
     *
     * @return card_type - 0:无证件，1:身份证
     */
    public Short getCardType() {
        return cardType;
    }

    /**
     * 设置0:无证件，1:身份证
     *
     * @param cardType 0:无证件，1:身份证
     */
    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取证件号码
     *
     * @return card_no - 证件号码
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置证件号码
     *
     * @param cardNo 证件号码
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * 获取支付宝账号
     *
     * @return alipay - 支付宝账号
     */
    public String getAlipay() {
        return alipay;
    }

    /**
     * 设置支付宝账号
     *
     * @param alipay 支付宝账号
     */
    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    /**
     * 获取10为优易充app；20:e充网30:桩先生
     *
     * @return reg_source - 10为优易充app；20:e充网30:桩先生
     */
    public Short getRegSource() {
        return regSource;
    }

    /**
     * 设置10为优易充app；20:e充网30:桩先生
     *
     * @param regSource 10为优易充app；20:e充网30:桩先生
     */
    public void setRegSource(Short regSource) {
        this.regSource = regSource;
    }

    /**
     * 获取社交账号
     *
     * @return qq - 社交账号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置社交账号
     *
     * @param qq 社交账号
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取地级市
     *
     * @return city - 地级市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置地级市
     *
     * @param city 地级市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取联系地址
     *
     * @return addr - 联系地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置联系地址
     *
     * @param addr 联系地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * @return community
     */
    public String getCommunity() {
        return community;
    }

    /**
     * @param community
     */
    public void setCommunity(String community) {
        this.community = community;
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取是否被锁定
     *
     * @return locked - 是否被锁定
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 设置是否被锁定
     *
     * @param locked 是否被锁定
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * 获取用户等级
     *
     * @return user_level - 用户等级
     */
    public Integer getUserLevel() {
        return userLevel;
    }

    /**
     * 设置用户等级
     *
     * @param userLevel 用户等级
     */
    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 获取0：未认证，1：认证中：2：认证通过3：认证失败
     *
     * @return user_integral - 0：未认证，1：认证中：2：认证通过3：认证失败
     */
    public Integer getUserIntegral() {
        return userIntegral;
    }

    /**
     * 设置0：未认证，1：认证中：2：认证通过3：认证失败
     *
     * @param userIntegral 0：未认证，1：认证中：2：认证通过3：认证失败
     */
    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }

    /**
     * 获取是否认证
     *
     * @return auth_status - 是否认证
     */
    public Byte getAuthStatus() {
        return authStatus;
    }

    /**
     * 设置是否认证
     *
     * @param authStatus 是否认证
     */
    public void setAuthStatus(Byte authStatus) {
        this.authStatus = authStatus;
    }

    /**
     * 获取用户大类，默认为1不要修改
     *
     * @return user_class - 用户大类，默认为1不要修改
     */
    public Byte getUserClass() {
        return userClass;
    }

    /**
     * 设置用户大类，默认为1不要修改
     *
     * @param userClass 用户大类，默认为1不要修改
     */
    public void setUserClass(Byte userClass) {
        this.userClass = userClass;
    }

    /**
     * 获取拥有车型（多个用分号[;]分隔）
     *
     * @return car_owned - 拥有车型（多个用分号[;]分隔）
     */
    public String getCarOwned() {
        return carOwned;
    }

    /**
     * 设置拥有车型（多个用分号[;]分隔）
     *
     * @param carOwned 拥有车型（多个用分号[;]分隔）
     */
    public void setCarOwned(String carOwned) {
        this.carOwned = carOwned;
    }

    /**
     * 获取用户类型（1:私人用户；2普通用户）
     *
     * @return user_type - 用户类型（1:私人用户；2普通用户）
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型（1:私人用户；2普通用户）
     *
     * @param userType 用户类型（1:私人用户；2普通用户）
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取绑定的第三方账户类型，3：微信，4qq
     *
     * @return bind_type - 绑定的第三方账户类型，3：微信，4qq
     */
    public Integer getBindType() {
        return bindType;
    }

    /**
     * 设置绑定的第三方账户类型，3：微信，4qq
     *
     * @param bindType 绑定的第三方账户类型，3：微信，4qq
     */
    public void setBindType(Integer bindType) {
        this.bindType = bindType;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取用户头像，私人用户才有
     *
     * @return avatar_url - 用户头像，私人用户才有
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 设置用户头像，私人用户才有
     *
     * @param avatarUrl 用户头像，私人用户才有
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取百度钱包协议号
     *
     * @return contract_no - 百度钱包协议号
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * 设置百度钱包协议号
     *
     * @param contractNo 百度钱包协议号
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    /**
     * 获取是否已经签约
     *
     * @return contract_flag - 是否已经签约
     */
    public Boolean getContractFlag() {
        return contractFlag;
    }

    /**
     * 设置是否已经签约
     *
     * @param contractFlag 是否已经签约
     */
    public void setContractFlag(Boolean contractFlag) {
        this.contractFlag = contractFlag;
    }

    /**
     * 获取支付姓名
     *
     * @return alipay_name - 支付姓名
     */
    public String getAlipayName() {
        return alipayName;
    }

    /**
     * 设置支付姓名
     *
     * @param alipayName 支付姓名
     */
    public void setAlipayName(String alipayName) {
        this.alipayName = alipayName;
    }

    /**
     * 获取充电币
     *
     * @return charging_coins - 充电币
     */
    public BigDecimal getChargingCoins() {
        return chargingCoins;
    }

    /**
     * 设置充电币
     *
     * @param chargingCoins 充电币
     */
    public void setChargingCoins(BigDecimal chargingCoins) {
        this.chargingCoins = chargingCoins;
    }

    /**
     * 获取支付宝账号（消费）
     *
     * @return alipay_account - 支付宝账号（消费）
     */
    public String getAlipayAccount() {
        return alipayAccount;
    }

    /**
     * 设置支付宝账号（消费）
     *
     * @param alipayAccount 支付宝账号（消费）
     */
    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    @Override
    public String toString() {
        return "UserPerson{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", thirdUid='" + thirdUid + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", nickName='" + nickName + '\'' +
                ", realName='" + realName + '\'' +
                ", gender=" + gender +
                ", cardType=" + cardType +
                ", cardNo='" + cardNo + '\'' +
                ", alipay='" + alipay + '\'' +
                ", regSource=" + regSource +
                ", qq='" + qq + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", addr='" + addr + '\'' +
                ", community='" + community + '\'' +
                ", deleted=" + deleted +
                ", locked=" + locked +
                ", userLevel=" + userLevel +
                ", userIntegral=" + userIntegral +
                ", authStatus=" + authStatus +
                ", userClass=" + userClass +
                ", carOwned='" + carOwned + '\'' +
                ", userType='" + userType + '\'' +
                ", bindType=" + bindType +
                ", remark='" + remark + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", createTime=" + createTime +
                ", contractNo='" + contractNo + '\'' +
                ", contractFlag=" + contractFlag +
                ", alipayName='" + alipayName + '\'' +
                ", chargingCoins=" + chargingCoins +
                ", alipayAccount='" + alipayAccount + '\'' +
                '}';
    }
}
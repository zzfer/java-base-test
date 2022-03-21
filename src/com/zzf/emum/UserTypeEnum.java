package com.zzf.emum;

/**
 *
 */
public enum UserTypeEnum{
    /**
     * 用户类型枚举
     */
    ORDINARY_MEMBER(0,"普通用户"),
    VIP_MEMBER(1,"vip会员"),
    SUPER_VIP_MEMBER(2,"超级vip会员");

	public int value;
	public String msg;

    UserTypeEnum(int value, String msg) {
        this.value = value;
        this.msg = msg;
    }
}
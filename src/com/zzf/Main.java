package com.zzf;

import com.zzf.emum.UserTypeEnum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int userType = 1;
        if (UserTypeEnum.ORDINARY_MEMBER.value == userType) {
            System.out.println(UserTypeEnum.ORDINARY_MEMBER.msg);
        } else if (UserTypeEnum.VIP_MEMBER.value == userType) {
            System.out.println(UserTypeEnum.ORDINARY_MEMBER.msg);
        } else if (UserTypeEnum.SUPER_VIP_MEMBER.value == userType) {
            System.out.println(UserTypeEnum.ORDINARY_MEMBER.msg);
        }
    }
}

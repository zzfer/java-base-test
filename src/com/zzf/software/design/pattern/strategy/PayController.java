package com.zzf.software.design.pattern.strategy;

/**
 * 策略模式 + 工厂模式
 * 模拟支付 controller
 *
 * @author zhaozhifei
 * @className PayController
 * @date 2022/3/18
 */
public class PayController {

    public static void main(String[] args) {
        payMethod("WX_PAY");
    }

    public static void payMethod(String payType){
        //工厂模式
        PayOrderHandler payService = PayFactory.getPayService(payType);
        payService.pay();
        //策略模式+工厂模式
        PayHandle payHandle = new PayHandle(PayFactory.getPayService(payType));
        payHandle.pay();
    }
}

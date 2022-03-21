package com.zzf.software.design.pattern.strategy;

/**
 * 支付宝支付
 *
 * @author zhaozhifei
 * @className AliPayOrderHandler
 * @date 2022/3/18
 */
public class AliPayOrderHandler implements PayOrderHandler{
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}

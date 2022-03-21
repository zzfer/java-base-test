package com.zzf.software.design.pattern.strategy;

/**
 * 微信支付
 *
 * @author zhaozhifei
 * @className WxPayOrderHandler
 * @date 2022/3/18
 */
public class WxPayOrderHandler implements PayOrderHandler {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}

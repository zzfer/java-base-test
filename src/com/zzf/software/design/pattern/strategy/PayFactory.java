package com.zzf.software.design.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付工厂
 *
 * @author zhaozhifei
 * @className PayFactory
 * @date 2022/3/18
 */
public class PayFactory {

    private static final Map<String, PayOrderHandler> map = new HashMap<>();

    static {
        map.put("WX_PAY", new WxPayOrderHandler());
        map.put("ALI_PAY", new AliPayOrderHandler());
    }

    public static PayOrderHandler getPayService(String payType) {
        return map.get(payType);
    }
}

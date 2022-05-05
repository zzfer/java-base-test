package com.zzf.software.design.pattern.strategy;


/**
 * 支付策略
 *
 * @author zhaozhifei
 * @className PayFactory
 * @date 2022/5/5
 */
public class PayHandle {

    private PayOrderHandler payOrderHandler;

    public PayHandle(PayOrderHandler payOrderHandler) {
        this.payOrderHandler = payOrderHandler;
    }

    public void pay(){
        payOrderHandler.pay();
    }

    public PayHandle() {
        super();
    }

}

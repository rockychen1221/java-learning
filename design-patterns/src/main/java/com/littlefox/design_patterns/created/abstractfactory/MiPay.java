package com.littlefox.design_patterns.created.abstractfactory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 15:05
 */
public class MiPay extends NFCAbstractPay {
    @Override
    public void payment() {
        System.out.println("欢迎使用MiPay付款");
    }
}

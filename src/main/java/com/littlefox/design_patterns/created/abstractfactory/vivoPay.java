package com.littlefox.design_patterns.created.abstractfactory;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-09-30 15:06
 */
public class vivoPay extends NFCAbstractPay {
    @Override
    public void payment() {
        System.out.println("欢迎使用vivoPay付款");
    }
}

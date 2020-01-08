package com.offcn.pay.impl;

import com.offcn.pay.PayService;

/**
 * ClassName:PayServiceImpl
 * PackageName:com.offcn.pay.impl
 *
 * @Date:2020/1/8 20:26
 * @Author:Mr.Li
 */
public class PayServiceImpl implements PayService {
    @Override
    public void add(Double money) {
        System.out.println("支付增加");
    }

    @Override
    public void update(Double money) {
        System.out.println("支付修改");
    }

    @Override
    public void delete(Long id) {
        System.out.println("支付删除");
    }
}

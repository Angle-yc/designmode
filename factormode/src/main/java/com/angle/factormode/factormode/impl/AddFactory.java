package com.angle.factormode.factormode.impl;

import com.angle.factormode.easeFactormode.impl.Add;
import com.angle.factormode.easeFactormode.inter.inter.Operator;
import com.angle.factormode.factormode.inter.Factory;

/**
 * 作者    angle
 * 时间    2019-12-18 16:30
 * 文件    DesignModeStu
 * 描述
 */
public class AddFactory implements Factory {
    @Override
    public Operator createOperation() {
        return new Add();
    }
}

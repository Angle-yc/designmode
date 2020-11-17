package com.angle.factormode.factormode.impl;

import com.angle.factormode.easeFactormode.impl.Sub;
import com.angle.factormode.easeFactormode.inter.inter.Operator;
import com.angle.factormode.factormode.inter.Factory;

/**
 * 作者    angle
 * 时间    2019-12-18 16:31
 * 文件    DesignModeStu
 * 描述
 */
public class SubFactory implements Factory {
    @Override
    public Operator createOperation() {
        return new Sub();
    }
}

package com.angle.factormode.factormode.impl;

import com.angle.factormode.easeFactormode.impl.Div;
import com.angle.factormode.easeFactormode.inter.inter.Operator;
import com.angle.factormode.factormode.inter.Factory;

/**
 * 作者    angle
 * 时间    2019-12-18 16:32
 * 文件    DesignModeStu
 * 描述
 */
public class DivFactory implements Factory {
    @Override
    public Operator createOperation() {
        return new Div();
    }
}

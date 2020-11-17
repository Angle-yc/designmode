package com.angle.factormode.easeFactormode.impl;

import com.angle.factormode.easeFactormode.inter.inter.Operator;

/**
 * 作者    angle
 * 时间    2019-12-18 15:42
 * 文件    DesignModeStu
 * 描述    乘
 */
public class Mul implements Operator {
    @Override
    public double getResult(double val1, double val2) {
        return val1 * val2;
    }
}

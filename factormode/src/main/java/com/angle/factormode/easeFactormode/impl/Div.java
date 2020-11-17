package com.angle.factormode.easeFactormode.impl;

import com.angle.factormode.easeFactormode.inter.inter.Operator;

/**
 * 作者    angle
 * 时间    2019-12-18 15:43
 * 文件    DesignModeStu
 * 描述    除
 */
public class Div implements Operator {
    @Override
    public double getResult(double val1, double val2) {
        if (val2 == 0){
            throw new NumberFormatException("除数不能为0!");
        }
        return val1 / val2;
    }
}

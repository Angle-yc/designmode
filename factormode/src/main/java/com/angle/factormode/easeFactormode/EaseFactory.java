package com.angle.factormode.easeFactormode;

import com.angle.factormode.easeFactormode.impl.Add;
import com.angle.factormode.easeFactormode.impl.Div;
import com.angle.factormode.easeFactormode.impl.Mul;
import com.angle.factormode.easeFactormode.impl.Sub;
import com.angle.factormode.easeFactormode.inter.inter.Operator;

/**
 * 作者    angle
 * 时间    2019-12-18 15:45
 * 文件    DesignModeStu
 * 描述
 */
public class EaseFactory {
    public static enum OPERATE {
        ADD,
        SUB,
        MUL,
        DIV
    }
    public static Operator createOperation(OPERATE type){
        Operator operator = null;
        switch (type){
            case ADD:
                operator = new Add();
                break;
            case SUB:
                operator = new Sub();
                break;
            case MUL:
                operator = new Mul();
                break;
            case DIV:
                operator = new Div();
                break;
        }
        return operator;
    }
}

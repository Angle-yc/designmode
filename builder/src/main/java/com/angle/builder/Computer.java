package com.angle.builder;
/**
 * 作者    angle
 * 时间    2019-12-17 15:34
 * 文件    DesignModeStu
 * 描述
 * 建造者（Builder）模式的定义：指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。它是将一个复杂的对象分解为多个简单的对象，然后一步一步构建而成。它将变与不变相分离，即产品的组成部分是不变的，但每一部分是可以灵活选择的。
 *
 * 该模式的主要优点如下：
 * 各个具体的建造者相互独立，有利于系统的扩展。
 * 客户端不必知道产品内部组成的细节，便于控制细节风险。
 *
 * 其缺点如下：
 * 产品的组成部分必须相同，这限制了其使用范围。
 * 如果产品的内部变化复杂，该模式会增加很多的建造者类。
 */
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

    public  Computer(){
        throw new RuntimeException("can`t init");
    }

    private Computer(Builder builder){
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainBoard = builder.mainBoard;
    }

    @Override
    public String toString() {
        return "Computer : {" +
                "cpu : "+cpu +", " +
                "screen :"+screen +", " +
                "memory : "+memory +", " +
                "mainBoard :"+mainBoard +"}";
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;
        public Builder(){}

        public Builder cpu(String val){
            cpu = val;
            return this;
        }

        public Builder screen(String val){
            screen = val;
            return this;
        }

        public Builder memory(String val){
            memory = val;
            return this;
        }

        public Builder mainBoard(String val){
            mainBoard = val;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}

package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWhitDependencyImplement implements MyBeanWhitDependency{

    private MyOperation myOperation;

    public MyBeanWhitDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWhitDependency() {
        int num = 2;

        System.out.println(myOperation.sum(num));

        System.out.println("Hola desde la implementacion desde un bean con dependencia");
    }
}

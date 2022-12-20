package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanImplement implements myBean{

    @Override
    public void print() {
        System.out.println("Hola desde mi implemantacion propia del bean");
    }
}

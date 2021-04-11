package com.ah_abdelhak.testutils;
/*
* Class refere to simple calculation for 2 integer numbers
* All to follow step by step launching first library
* */
public class Calculator {

    public static int Plus(int a, int b){
        return a+b;
    }
    public static int Minus(int a, int b){
        return a-b;
    }
    public static int Multi(int a, int b){
        return a*b;
    }
    public static float Div(int a, int b){
        if(b==0)
         throw new IllegalArgumentException("Div By Zero Error");
         else
            return a/b;
    }

}

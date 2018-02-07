/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn;

/**
 *
 * @author Richard Munoz <richard.munoz at epn.edu.ec>
 */
interface Addable {

    int add(int a, int b);
}

public class LambdaExpressionExample5 {

    public static void main(String[] args) {

        // Multiple parameters in lambda expression  
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Multiple parameters with data type in lambda expression  
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));
    }
}

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
@FunctionalInterface  //It is optional  
interface Drawable {

    public void draw();
}

public class LambdaExpressionExample2 {

    public static void main(String[] args) {
        int width = 10;

        //with lambda  
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}

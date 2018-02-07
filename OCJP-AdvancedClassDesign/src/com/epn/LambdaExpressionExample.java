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
interface Drawable {

    public void draw();
}

public class LambdaExpressionExample {

    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class  
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}

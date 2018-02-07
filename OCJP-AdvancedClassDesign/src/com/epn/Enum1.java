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
public class Enum1 {

    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard Munoz <richard.munoz at epn.edu.ec>
 */
public class LambdaExpressionExample7 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("sony");
        list.add("samsung");
        list.add("nokia");
        list.add("motorola");

        list.forEach(
                (n) -> System.out.println(n)
        );
    }
}

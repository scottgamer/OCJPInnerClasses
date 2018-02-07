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
class Final1 {

    final int speedlimit = 90;//final variable  
    
    //no se puede cambiar el valor de un variable final
    void run() {
        //speedlimit = 400;
        System.out.println("La velocidad es: " + speedlimit);
    }

    public static void main(String args[]) {
        Final1 obj = new Final1();
        obj.run();
    }
}//end of class  

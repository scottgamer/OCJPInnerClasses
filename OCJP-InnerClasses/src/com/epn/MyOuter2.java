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
/*class MyOuter2 {

    private String x = "Outer2";

    void doStuff() {
        class MyInner {

            public void seeOuter() {
                System.out.println("Outer x is " + x);
            } // close inner class method
            
        } // close inner class definition
        
        MyInner mi = new MyInner(); // This line must come
                                    // after the class
        mi.seeOuter();
    } // close outer class method doStuff()
    
} // close outer class*/
class MyOuter2 {

    private String x = "Outer2";

    void doStuff() {
        final String z = "local variable";
        class MyInner {

            public void seeOuter() {
                System.out.println("Outer x is " + x);
                System.out.println("Local var z is " + z); // Won't Compile!
            } // close inner class method
        } // close inner class definition
    } // close outer class method doStuff()
} // close outer class

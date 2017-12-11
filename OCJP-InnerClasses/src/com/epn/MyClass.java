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

class OuterClass {
   int num;
   
   // inner class
   class InnerClass {
      
       public void print() {
         System.out.println("Esta es la clase interna!");
      }
   }
   // Accessing the inner class from the method within
   void mostrarInner() {
      InnerClass inner = new InnerClass();
      inner.print();
   }
}
   
public class MyClass {

   public static void main(String args[]) {
      // Instantiating the outer class 
      OuterClass outer = new OuterClass();
      // Accessing the display_Inner() method.
      outer.mostrarInner();
      
      OuterClass.InnerClass inner = new OuterClass().new InnerClass();
      inner.print();
   }
}

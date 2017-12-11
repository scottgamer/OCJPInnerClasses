/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternasAnonimasDefArgdeMetodos;

/**
 *
 * @author por-tosh
 */
public interface Foo {
    void foof();
}

class Bar{
    void doStuff(Foo f){}
}

class MyWonderfulClass{
    void go(){
        Bar b = new Bar();
        b.doStuff(new Foo(){
            public void foof() {
                System.out.println("foofy");
            }
        });
    }
}
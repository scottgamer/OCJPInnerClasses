/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternasAnonimasTipoUno;

/**
 *
 * @author por-tosh
 */
public class Persona {
    
    public void imprimir(){
        System.out.println("Persona");
    }
}

class Empleado{
    Persona p = new Persona(){
        public void imprimir(){
            System.out.println("Empleado");
        }
    };
    
}

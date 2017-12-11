/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternasAnonimasTipoDps;

/**
 *
 * @author por-tosh
 */
public interface Persona {
    public void imprimirNombre();
    
}

class Empleado{
    Persona persona = new Persona() {
        @Override
        public void imprimirNombre() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.out.println("Empleado");
        }
    };
}

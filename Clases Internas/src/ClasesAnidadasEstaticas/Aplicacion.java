/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAnidadasEstaticas;

/**
 *
 * @author por-tosh
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    static class Carrera{
        void imprimir(){
            System.out.println("Carrera");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Universidad.Facultad fac = new Universidad.Facultad();
        fac.imprimir();
        Carrera carr = new Carrera();
        carr.imprimir();
    }
}

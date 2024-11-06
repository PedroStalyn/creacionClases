
package ec.edu.espoch.sistemaclaseuno;

import ec.edu.espoch.sistemaclaseuno.clases.Persona;
import ec.edu.espoch.sistemaclaseuno.enumeraciones.Dias;

public class SistemaClaseUno {

    public static void main(String[] args) {
        /*Persona objPersona1 = new Persona();        
        objPersona1.nombre="Pedro";
        objPersona1.apellidoPaterno="Aguilar";
        objPersona1.apellidoMaterno="Encarnación";
        
        objPersona1.imprimir();*/
        
        Persona objPersona2 = new Persona();
        
        objPersona2.nombre="Cristian";
        objPersona2.apellidoPaterno="Valencia";
        objPersona2.apellidoMaterno="Papa";
        
        //objPersona2.imprimir();
        
        System.out.println("Los datos del objeto son:");
        System.out.println(objPersona2.imprimir2());
        
        System.out.println("el díe es: "+ Dias.MIERCOLES);
      
    }
}

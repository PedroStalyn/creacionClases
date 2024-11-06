package ec.edu.espoch.sistemaclaseuno.clases;

public class Persona {
    
    //Atributos de la clase
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    
    //métodos de la clase
    
    public void imprimir(){    
        System.out.println("Nombre:"+nombre);
        System.out.println("Apellido Paterno:"+apellidoPaterno);
        System.out.println("Apellido Materno:"+apellidoMaterno);
    }
    
    public String imprimir2(){
    
    return "nombre :"+nombre+" Apellido1:"+apellidoPaterno+" Apellido2:"+apellidoPaterno;
    }
    
}

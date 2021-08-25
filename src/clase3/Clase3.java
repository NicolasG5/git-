
package clase3;

import clases.Cliente;


public class Clase3 {


    public static void main(String[] args) {
        
        Cliente cli=new Cliente();
        cli.setRut("12365854-k");
        cli.setNombre("Juanito");
        cli.setApellido("Simio");
        cli.setEdad(6);
        System.out.println("Los Datos del Cliente son:"+cli.toString());
    }
    
}

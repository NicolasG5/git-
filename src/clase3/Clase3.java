
package clase3;

import clases.Cliente;
import java.util.Scanner;


public class Clase3 {


    public static void main(String[] args) {
        
        Cliente cli=new Cliente();
        cli.setRut("12365854-k");
        cli.setNombre("Juanito");
        cli.setApellido("Simio");
        cli.setEdad(6);
        System.out.println("Los Datos del Cliente son:"+cli.toString());
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese Rut:");
        String mi_rut= teclado.next();
        System.out.println("Ingrese Nombre:");
        String mi_nom = teclado.next();
        System.out.println("Ingrese Apellido:");
        String mi_ape = teclado.next();
        System.out.println("Ingrese Edad:");
        int mi_edad= teclado.nextInt();
        
        Cliente cli2 = new Cliente(mi_rut, mi_nom, mi_ape, mi_edad);
        System.out.println("Los datos son:"+cli2.toString());
    }
    
}

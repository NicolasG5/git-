
package clases;

public class Cliente {
    // (1) atributos
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    // (2) constructores
    // constructor sin parametros
    public Cliente() {
    }
    // constructor con parametros
    public Cliente(String rut, String nombre, String apellido, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    // (3) metodos accesadores y mutadores (get y set)

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // (4) metodo toString()  --> retornar los atributos de la clase

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    // (5) metodos customer (personalizados)
    public String ofrecerCredito(){
        if (edad>=18 && edad<=50) {
            return "apta para credito";
        } else {
            return "no puede pedir el credito";
        }
    }
    
    
}

package misClases;

public class Persona {
    private int ID;
    private String nombre;
    private int edad;
    
    public int getID(){
        return ID;
    }
    public void setID(int valorID){
        ID = valorID;
    }
    public String getNomnbre(){
        return nombre;
    }
    public void nombre(String valorNombre){
        nombre = valorNombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valorEdad){
        edad = valorEdad;
    }
    public void imprimirDatos(){
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
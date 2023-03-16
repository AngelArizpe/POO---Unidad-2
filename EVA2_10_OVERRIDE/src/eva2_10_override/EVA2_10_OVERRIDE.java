package eva2_10_override;

public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        //No hubo necesidad de llamar a toString
        Persona perso = new Persona(); //Instanciar
        Persona perso2 = new Persona("It's a me, Mario", 40);
        System.out.println(perso);
        System.out.println(perso2);
    }
}

class Persona{
    private String nombre;
    private int edad;
    
    public Persona(){
        this.nombre = "----";
        this.edad = 0;
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        //No estamos invocando al método sobreescrito de la superclase
        //Aquí estamos reemplazando totalmente a toString de la superClase
       String cade = "Datos: \n" + 
                     "Nombre: " + nombre + "\n" + 
                     "Edad: " + edad;
       return cade;
    }
}
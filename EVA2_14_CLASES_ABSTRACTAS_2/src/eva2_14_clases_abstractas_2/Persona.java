package eva2_14_clases_abstractas_2;

public abstract class Persona {
    
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
    
    //Los métodos abstractos pueden mezclarse con métodos normales
    public abstract void imprimirDatos();
        
}

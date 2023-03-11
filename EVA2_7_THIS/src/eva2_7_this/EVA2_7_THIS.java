package eva2_7_this;

public class EVA2_7_THIS {

    public static void main(String[] args) {
        //this. (no pasa nada)
        //this es mo estático, por lo que no se puede usar en un contexto estático
    }
    
    public void imprimir(){
        //Aquí también se puede usar this
    }
    
}

//this es una referencia a una instancia de la clase
//Todos los objetos tienen this
//Pueden usar this en cualquier clase
//this solo existe internamente dentro del objeto, visible dentro de las clases
class Persona{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
        //this.nombre es el atributo de la clase
        //nombre es la variable (par+amtro declarado en el método
        //Sin el this, la variable nombre pertenece toda al metodo set
        //Con this, indica que la variable nombre con this es la declarada al inicio
        //Antes lo resolviamos cambiando el nombre del parámetro en el set
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }
    public void ImprimirDatos(){
        System.out.println("El nombre es: " + this.nombre);
    }
}
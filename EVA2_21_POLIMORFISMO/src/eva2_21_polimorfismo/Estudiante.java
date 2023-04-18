package eva2_21_polimorfismo;

public class Estudiante extends Persona{
    private String numControl;
    
    public Estudiante(){
        super(); 
        this.numControl = "----";
    }   
    public Estudiante(String nombre, String apellido, int edad, String numControl){
        super(nombre, apellido, edad);
        this.numControl = numControl;
    }

    public String getNumcontrol() {
        return numControl;
    }
    
    public void setNumcontrol(String numcontrol) {
        this.numControl = numcontrol;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos(); 
        System.out.println("Numero de control: " + numControl);
    }
    
}
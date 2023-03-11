package eva2_3_extends;

//Clase derivada extiende a la clase base
//Subclase extends superclase
//Hijo extiende Padre
//Estudiante is-a (es-un) persona
public class Estudiante extends Persona{
    private String numcontrol;

    public String getNumcontrol() {
        return numcontrol;
    }

    public void setNumcontrol(String numcontrol) {
        this.numcontrol = numcontrol;
    }
    
    
}

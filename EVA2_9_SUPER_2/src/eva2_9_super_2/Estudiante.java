package eva2_9_super_2;

public class Estudiante extends Persona{
    private String numControl;
    
    public Estudiante(){
        super(); //Llamada al cosntructor de la superclase
        this.numControl = "----";
    }   
    public Estudiante(String nombre, String apellido, int edad, String numControl){
        //Las variables que hereda de persona no pueden ser heredadas con this
        //Hay que especificar el constructor al que queramos llamar
        //Super puede llamar tanto al constructor default como al constructor con argumentos
        super(nombre, apellido, edad);
        this.numControl = numControl;
    }

    public String getNumcontrol() {
        return numControl;
    }
    
    public void setNumcontrol(String numcontrol) {
        this.numControl = numcontrol;
    }
    
    //Override oculta el método (con la misma firma) de la superclase
    //En este caso, ocultamos a imprimirDatos de Persona
    //Estamos reemplazando el imprimirDatos de Persona con el de Estudiante
    @Override
    public void imprimirDatos(){
        
        //Esta es una salida para que no reemplaze los datos de nombre, apellido y edad
        //Salida 1 a través de métodos get y set (no muy reocmendada)
        /*System.out.println("Datos");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Número de control: " + getNumcontrol());*/
        
        //Salida 2, agregando funcionalidad al método que ya teniamos
        super.imprimirDatos(); //Este método viene de persona
        //Estamos agregandole funcionalidad al imprimir también el número de control
        System.out.println("Numero de control: " + numControl);
    }
    
}
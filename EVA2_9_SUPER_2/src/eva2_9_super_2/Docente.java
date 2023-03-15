package eva2_9_super_2;

public class Docente extends Persona{
    private String plaza;
    
    public Docente(){
        super();
        this.plaza = "----";
    }
    
    public Docente(String nombre, String apellido, int edad, String plaza){
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }
    
    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
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
        //Estamos agregandole funcionalidad al imprimir también la plaza
        System.out.println("Plaza: " + plaza);
    }
}
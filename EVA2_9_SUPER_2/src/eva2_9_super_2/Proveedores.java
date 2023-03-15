package eva2_9_super_2;

public class Proveedores extends Persona{
    private String RFC;
    
    public Proveedores(){
        super();
        this.RFC = "----";
    }
    
    public Proveedores(String nombre, String apellido, int edad, String RFC){
        super(nombre, apellido, edad);
        this.RFC = RFC;
    }
    
    public String getRFC() {
        return RFC;
    }
    
    public void setRFC(String RFC) {
        this.RFC = RFC;
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
        System.out.println("RFC: " + RFC);
    }
}


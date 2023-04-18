package eva2_25_has_a_direccion;

public class EVA2_25_HAS_A_DIRECCION {

    public static void main(String[] args) {
        Personas persona = new Personas();
        persona.setNombre("Pinwi");
        persona.setApellido("Amadeus Aztaroth Ramírez John Cena Hernandez III");
        persona.setEdad(450);
        //Para asignar la dirección, debemos crear un objeto direccion
        Direccion direccion = new Direccion();
        direccion.setCalle("Por ahi");
        direccion.setNum(17);
        direccion.setColonia("San Felipe");
        direccion.setCP("1548648");
        direccion.setCiudad("Una de Tailandia, no recuerdo cual");
        direccion.setEstado("estado de ebriedad");
        persona.setDireccion(direccion);
        persona.setDireccion(direccion);
        persona.imprimirDatos();
        
        /*Si no crearamos el objeto dirección saldría error por querer llamar a
        objeto null (no existe)*/
        //Para esto es el if en el imprimirDatos de Persona
    }
    
}

class Direccion{
    private String calle;
    private int num;
    private String colonia;
    private String CP;
    private String ciudad;
    private String estado;
    
    
    public Direccion(){
        this.calle = "----";
        this.num = 0;
        this.colonia = "----";
        this.CP = "----";
        this.ciudad = "----";
        this.estado = "----";
    }
    
    public Direccion(String calle, int num, String colonia, String CP, String ciudad, String estado) {
        this.calle = calle;
        this.num = num;
        this.colonia = colonia;
        this.CP = CP;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void imprimirDatos(){
        System.out.println("Dirección: ");
        System.out.println(calle + " #" + num + ", " + colonia + "\nCP: " + CP + ", " + ciudad + ", " + estado);
    }
    
}

class Personas{
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion; //Persona Has a (tiene un/a) direccion
    
    
    public Personas(){
        this.nombre = "----";
        this.apellido = "----";
        this.edad = 0;
        this.direccion = null; // no existe el objeto direccion
    }
    
    public Personas(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        
        
        /*Este if es para si una persona no tiene dirección, para que no salga un error
        por querer llamar a un objeto que no existe*/
        
        if(direccion == null)
            System.out.println("Sin dirección");
        else
            direccion.imprimirDatos();
    }
    
}

class Sucursal{
    private String nombreSucursal;
    private Direccion direccion;
}
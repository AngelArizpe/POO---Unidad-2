package eva2_3_extends;

public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        estu.setNombre("Angel");
        estu.setApellido("Arizpe");
        estu.setEdad(18);
        estu.setNumcontrol("22550298");
        
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellido: " + estu.getApellido());
        System.out.println("Edad: " + estu.getEdad());
        System.out.println("Número de control: " + estu.getNumcontrol());
        
        Proveedores prove1 = new Proveedores();
        prove1.setNombre("El Bryan");
        prove1.setApellido("De la Cruz");
        prove1.setEdad(12);
        prove1.setRFC("AMAMARBOBBY14");
        
        System.out.println("Nombre: " + prove1.getNombre());
        System.out.println("Apellido; " + prove1.getApellido());
        System.out.println("Edad; " + prove1.getEdad());
        System.out.println("RFC; " + prove1.getRFC());
    }
    
}

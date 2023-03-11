package eva2_1_uml;
import misClases.Persona;
import misClases.TV;
import misClases.Vehiculo;

public class EVA2_1_UML {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        perso1.setID(1234);
        perso1.nombre("José José, el principe de la canción");
        perso1.setEdad(71);
        perso1.imprimirDatos();
        
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setMarca("Fotorama");
        vehiculo1.setModelo("Terrenator");
        vehiculo1.setAño(1492);
        vehiculo1.imprimirDatos();
        
        TV tv1 = new TV();
        tv1.setCanal(5);
        tv1.setvolumen(30);
        tv1.setPower(false);
        tv1.imprimirDatos();
    }
}

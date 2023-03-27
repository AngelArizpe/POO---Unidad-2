package eva2_17_interfaces;

public class EVA2_17_INTERFACES {

    public static void main(String[] args) {
        Persona perso = new Persona("El Billy", 62);
        perso.imprimirDatos();
        Computadora compu = new Computadora("Celeron", 2, 30000, "La poderosa");
        compu.imprimirDatos();
    }
    
}

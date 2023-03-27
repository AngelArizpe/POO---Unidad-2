package eva2_20_vehiculo;

public class EVA2_20_VEHICULO {

    public static void main(String[] args) {
        Automovil carrito = new Automovil("Bocho", 1492, 40, "Wolsbaguen", 30);
        System.out.println("Datos automovil:");
        carrito.detener();
        carrito.imprimirDatos();
        carrito.imprimirVelocidad();
        System.out.println("\n");
        
        Bicicleta baika = new Bicicleta("Estática", 30, 3, "Alcatel", 80);
        System.out.println("Datos bicicleta:");
        baika.acelerar();
        baika.imprimirDatos();
        baika.imprimirVelocidad();
    }
    
}

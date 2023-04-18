package eva2_23_polimorfismo_vehiculos;

public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        Automovil auto = new Automovil("El del toreto", 32, 520, "Hot Wheels");
        Bicicleta bici = new Bicicleta("Triciclo", "Cuadrada", 17325, "Apache");
        
        cambiarVelocidad(auto, 2);
        cambiarVelocidad(bici, 13);
        //Clase object --> Object obj = auto;  
    }
    
    public static void cambiarVelocidad(DatosVehiculo vehi, int velocidad){
        vehi.acelerar(velocidad);
        vehi.tablero();
    }
}

interface DatosVehiculo{
    public abstract void acelerar (int cambio);
    void tablero();
    
}

class Vehiculo{
    protected int velocidad;
    private String marca;
    
    public Vehiculo(){
        this.velocidad = 0;
        this.marca = "----";
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad;
        this.marca = marca;
    }
    
    //La velocidad se modifica con acelerar
    public int getVelocidad() {
        return velocidad;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

class Automovil extends Vehiculo implements DatosVehiculo{
    
    private String modelo;
    private int año;
    
    
    public Automovil(){
        super();
        this.modelo = "----";
        this.año = 0;
    }
    public Automovil(String modelo, int año, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if((cambioVel) >= 0) //Aceptar solo velocidades positivas
        velocidad = cambioVel; //velocidad = velocidad + cambio <-- acumulador
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad del auto: " + getVelocidad());
    }
}

class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo; //montaña, pista, etc.
    private String rodada; //Tipo de llanta

    public Bicicleta() {
        super();
        this.tipo = "----";
        this.rodada = "----";
    }

    public Bicicleta(String tipo, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if((cambioVel) >= 0) //Aceptar solo velocidades positivas
        velocidad = cambioVel; //velocidad = velocidad + cambio <-- acumulador
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de la bicicleta: " + getVelocidad());
    }
      
}

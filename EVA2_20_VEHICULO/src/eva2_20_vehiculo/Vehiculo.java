package eva2_20_vehiculo;

public abstract class Vehiculo {
    protected int velocidadIni;
    private String marca;
    private int magnitudAcel;
    protected int velocidadFin;
    
    public Vehiculo(){
        this.velocidadIni = 0;
        this.marca = "----";
        this.magnitudAcel = 0;
    }
    
    public Vehiculo(int velocidad, String marca, int magnitudAcel) {
        this.velocidadIni = velocidad;
        this.marca = marca;
        this.magnitudAcel = magnitudAcel;
    }

    public int getVelocidadIni() {
        return velocidadIni;
    }

    public void setVelocidadIni(int velocidadIni) {
        this.velocidadIni = velocidadIni;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getMagnitudAcel(){
        return magnitudAcel;
    }
    
    public void setMagnitudAcel(int magnitudAcel){
        this.magnitudAcel = magnitudAcel;
    }
}

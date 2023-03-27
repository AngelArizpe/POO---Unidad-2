package eva2_20_vehiculo;

public class Automovil extends Vehiculo implements ControlVelocidad{
    private String modelo;
    private int año;
    
    public Automovil() {
        super();
        this.modelo = "----";
        this.año = 0;
    }

    public Automovil(String modelo, int año, int velocidadIni, String marca, int MagnitudAcel) {
        super(velocidadIni, marca, MagnitudAcel);
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
    public int acelerar(){
        velocidadFin = getVelocidadIni() + getMagnitudAcel();
        return velocidadFin;
    }
    
    @Override
    public int detener(){
        if(getVelocidadIni() >= getMagnitudAcel()){
            velocidadFin = getVelocidadIni() - getMagnitudAcel();
        }
        
        else if(getVelocidadIni() <= getMagnitudAcel()){
        velocidadFin = 0;
        }
        return velocidadFin;
    }
    
    @Override
    public void imprimirVelocidad(){
        System.out.println("Velocidad final:" + velocidadFin);
    }
    
    public void imprimirDatos(){
        System.out.println("Velocidad inicial: " + getVelocidadIni());
        System.out.println("Marca: " + getMarca());
        System.out.println("Aceleración: " + getMagnitudAcel());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Año: " + getAño());
    }
}

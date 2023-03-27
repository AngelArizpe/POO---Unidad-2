package eva2_20_vehiculo;

public class Bicicleta extends Vehiculo implements ControlVelocidad{
    private String tipo;
    private double tamaño; //Altura de la bici en cm
    
    
    public Bicicleta(){
        super();
        this.tipo = "----";
        this.tamaño = 0.0;
    }
    
    public Bicicleta(String tipo, double tamaño, int velocidadIni, String marca, int magnitudAcel){
        super(velocidadIni, marca, magnitudAcel);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
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
        System.out.println("Tipo: " + getTipo());
        System.out.println("Tamaño: " + getTamaño());
    }
}

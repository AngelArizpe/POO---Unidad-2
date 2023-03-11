package misClases;

public class TV {
    private int canal;
    private int volumen;
    private boolean power;
    
    public int getCanal(){
        return canal;
    }
    public void setCanal(int valorCanal){
        canal = valorCanal;
    }
    public int getVlomune(){
        return volumen;
    }
    public void setvolumen(int valorVolumen){
        canal = valorVolumen;
    }
    public boolean getPower(){
        return power;
    }
    public void setPower(boolean valorPower){
        power = valorPower;
    }
    public void imprimirDatos(){
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("Power: " + power);
    }
}
package misClases;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valorMarca){
        marca = valorMarca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valorModelo){
        modelo = valorModelo;
    }
    public int getAño(){
        return año;
    }
    public void setAño(int valorAño){
        año = valorAño;
    }
    public void imprimirDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
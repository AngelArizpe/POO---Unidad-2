package Productos;
import SuperClases.Electronica;

//Usamos final para que no se pueda heredar de esta clase
//No se puede crear una clase que extienda de computadora (ejemplo: laptop, PC, etc.)
public final class Computadora extends Electronica{
    private double tamaño;
    private int memoria;
    private String procesador;
    private String discoDuro;

    public Computadora() {
        this.tamaño = 0;
        this.memoria = 0;
        this.procesador = "----";
        this.discoDuro = "----";
    }

    public Computadora(double tamaño, int memoria, String procesador, String discoDuro, String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantia, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.discoDuro = discoDuro;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }
    
    @Override
    public double precioVenta(int cantidad){
        //10 unidades --> el precio es del 80%
        if (cantidad<10)
            return getPrecio()*cantidad;
        else
            return (getPrecio()*0.80)*cantidad;
    }
    
    @Override
    public String toString(){
        String cade = "Tamaño: " + tamaño + "\n" +
                    "Memoria: " + memoria + "\n" +
                    "procesador: " + procesador + "\n" +
                    "Disco duro: " + discoDuro + "\n" +
                    "Fabricante: " + getFabricante() + "\n" +
                    "Modelo: " + getModelo() + "\n" +
                    "Garantia: " + getGarantia() + "\n" +
                    "Precio por unidad: " + getPrecio() + "\n" +
                    "Nombre: " + getNombre() + "\n" +
                    "Unidad: " + getUnidad();
        return cade;
    }
}

package Productos;
import SuperClases.Ropa;

//Usamos final para que no se pueda heredar de esta clase
public final class Playera extends Ropa{
    private String talla;
    private String tipo;
    
    public Playera(){
        super();
        this.talla = "----";
        this.tipo = "----";
    }
    
    public Playera(String talla, String tipo, String marca, String color, double precio, String nombre, String unidad){
        super(marca, color, precio, nombre, unidad);
        this.talla = talla;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    
    public double precioVenta(int cantidad){
        //10 unidades --> el precio es del 80%
        if (cantidad<10)
            return getPrecio()*cantidad;
        else
            return (getPrecio()*0.80)*cantidad;
    }
}

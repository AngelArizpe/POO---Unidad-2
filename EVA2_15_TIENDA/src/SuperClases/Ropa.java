package SuperClases;

public abstract class Ropa extends Producto{
    private String marca;
    private String color;
    
    public Ropa(){
        super();
        this.marca = "----";
        this.color = "----";
    }
    
    public Ropa(String marca, String color, double precio, String nombre, String unidad){
        super(precio, nombre, unidad);
        this.color = color;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}

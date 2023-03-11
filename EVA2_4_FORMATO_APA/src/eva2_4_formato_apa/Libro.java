package eva2_4_formato_apa;

public class Libro extends Documento{
    private String editorial;
    private int volumen;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }  
}

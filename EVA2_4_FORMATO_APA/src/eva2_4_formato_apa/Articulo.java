package eva2_4_formato_apa;

public class Articulo extends Documento{
    private int paginas;
    private String tituloBreve;

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTituloBreve() {
        return tituloBreve;
    }

    public void setTituloBreve(String tituloBreve) {
        this.tituloBreve = tituloBreve;
    }
}

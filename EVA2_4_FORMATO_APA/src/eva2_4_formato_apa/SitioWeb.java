package eva2_4_formato_apa;

public class SitioWeb extends Documento{
    private int añoConsulta;
    private String mesConsulta;
    private int diaConsulta;
    private String URL;

    public int getAñoConsulta() {
        return añoConsulta;
    }

    public void setAñoConsulta(int añoConsulta) {
        this.añoConsulta = añoConsulta;
    }

    public String getMesConsulta() {
        return mesConsulta;
    }

    public void setMesConsulta(String mesConsulta) {
        this.mesConsulta = mesConsulta;
    }

    public int getDiaConsulta() {
        return diaConsulta;
    }

    public void setDiaConsulta(int diaConsulta) {
        this.diaConsulta = diaConsulta;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}


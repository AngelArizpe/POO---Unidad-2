package eva2_4_formato_apa;

public class EVA2_4_FORMATO_APA {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        System.out.println("LIBRO:");
        libro1.setAutor("Mi tio pepe");
        libro1.setTitulo("Historia del chocomilk");
        libro1.setAño(2012);
        libro1.setMes("Mayo");
        libro1.setDia(28);
        libro1.setCiudad("Ecatepec");
        libro1.setEditorial("Papelería el ábaco");
        libro1.setVolumen(4);
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Año: " + libro1.getAño());
        System.out.println("Mes: " + libro1.getMes());
        System.out.println("Dia: " + libro1.getDia());
        System.out.println("Ciudad: " + libro1.getCiudad());
        System.out.println("Editorial: " + libro1.getEditorial());
        System.out.println("Volumen: " + libro1.getVolumen());
        
        Articulo articulo1 = new Articulo();
        System.out.println("ARTICULO:");
        articulo1.setAutor("Mi tio Toño");
        articulo1.setTitulo("A la electricidad no hay que tenerle miedo, sino respeto");
        articulo1.setAño(2021);
        articulo1.setMes("Abril");
        articulo1.setDia(2);
        articulo1.setCiudad("Tlaxcala");
        articulo1.setPaginas(52);
        articulo1.setTituloBreve("Diablito en un poste de luz");
        System.out.println("Autor: " + articulo1.getAutor());
        System.out.println("Título: " + articulo1.getTitulo());
        System.out.println("Año: " + articulo1.getAño());
        System.out.println("Mes: " + articulo1.getMes());
        System.out.println("Dia: " + articulo1.getDia());
        System.out.println("Ciudad: " + articulo1.getCiudad());
        System.out.println("Paginas: " + articulo1.getPaginas());
        System.out.println("Título breve: " + articulo1.getTituloBreve());
        
        Informe informe1 = new Informe();
        System.out.println("INFORME");
        informe1.setAutor("Keanu Reeves");
        informe1.setTitulo("Los desayunos de la cafe están ricos");
        informe1.setAño(2023);
        informe1.setMes("Marzo");
        informe1.setDia(10);
        informe1.setCiudad("Chihuahua");
        informe1.setInstitucion("El tec");
        informe1.setDepartamento("Ciencias básicas");
        System.out.println("Autor: " + informe1.getAutor());
        System.out.println("Título: " + informe1.getTitulo());
        System.out.println("Año: " + informe1.getAño());
        System.out.println("Mes: " + informe1.getMes());
        System.out.println("Dia: " + informe1.getDia());
        System.out.println("Ciudad: " + informe1.getCiudad());
        System.out.println("Insittucion: " + informe1.getInstitucion());
        System.out.println("Departamento: " + informe1.getDepartamento());
        
        SitioWeb sitio1 = new SitioWeb();
        System.out.println("SITIO WEB:");
        sitio1.setAutor("John Cena");
        sitio1.setTitulo("Albumes de Los Acosta: del peor al mejor");
        sitio1.setAño(2022);
        sitio1.setMes("Junio");
        sitio1.setDia(23);
        sitio1.setCiudad("Oaxaca");
        sitio1.setAñoConsulta(2023);
        sitio1.setMesConsulta("Enero");
        sitio1.setDiaConsulta(8);
        sitio1.setURL("www.johncenaeschido.com");
        System.out.println("Autor: " + sitio1.getAutor());
        System.out.println("Título: " + sitio1.getTitulo());
        System.out.println("Año: " + sitio1.getAño());
        System.out.println("Mes: " + sitio1.getMes());
        System.out.println("Dia: " + sitio1.getDia());
        System.out.println("Ciudad: " + sitio1.getCiudad());
        System.out.println("Año de consulta: " + sitio1.getAñoConsulta());
        System.out.println("Mes de consulta: " + sitio1.getMesConsulta());
        System.out.println("Dia de consulta: " + sitio1.getDiaConsulta());
        System.out.println("URL: " + sitio1.getURL());
    }
}
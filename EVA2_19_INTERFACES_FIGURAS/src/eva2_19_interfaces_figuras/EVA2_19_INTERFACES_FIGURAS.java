package eva2_19_interfaces_figuras;

public class EVA2_19_INTERFACES_FIGURAS {

    public static void main(String[] args) {
        //MostrarDatos datos = new MostrarDatos(); --> Es abstracto, no se puede instanciar
        //Figuras fig = new Figuras(); --> Es abstracta, no se puede instanciar
        Circulo circu = new Circulo(20);
        circu.imprimirDatos();
        
        Triangulo tria = new Triangulo(20, 20);
        tria.imprimirDatos();
    }
    
}

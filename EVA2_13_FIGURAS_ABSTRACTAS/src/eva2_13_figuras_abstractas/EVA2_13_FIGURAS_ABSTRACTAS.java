package eva2_13_figuras_abstractas;

public class EVA2_13_FIGURAS_ABSTRACTAS {

    public static void main(String[] args) {
        
        //Figura no se puede trabajar, no hace nada por si sola
        //No tiene sentido crear objetos para figura y el abstract impide hacerlo
        //El abstract no impide la herencia, pueden seguirse usando para herencia
        //Figura fig = new Figura();
        
        //De circulo si tiene sentido crear objeto
        Circulo cir = new Circulo(10);
        
    }
    
}

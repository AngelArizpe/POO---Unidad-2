package eva2_24_collections;
import java.util.ArrayList;

public class EVA2_24_COLLECTIONS {

    public static void main(String[] args) {
        //Colections --> Contenedores
        //Son como arreglos pero mas sofisticados
        ArrayList miArreglo = new ArrayList();
        miArreglo.add(new Persona());
        miArreglo.add(new Perro());
        miArreglo.add(new Automovil());
        
        ArrayList <Integer> miArreglo2 = new ArrayList();
        //miArreglo2.add(Integer.SIZE); --> Solo guarda enteros
        miArreglo2.add(100);
        miArreglo2.add(200);
        miArreglo2.add(300);
        miArreglo2.add(400);
        System.out.println(miArreglo2);
        
        ArrayList <String> miArreglo3 = new ArrayList();
        //miArreglo3.add(e); --> Ahora solo guarda String
    }
    
}
class Persona{
    
}

class Automovil{
    
}

class Perro{

}
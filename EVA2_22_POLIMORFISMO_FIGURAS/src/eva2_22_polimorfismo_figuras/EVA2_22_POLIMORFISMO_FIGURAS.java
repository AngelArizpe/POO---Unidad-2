package eva2_22_polimorfismo_figuras;
import java.util.Scanner;

public class EVA2_22_POLIMORFISMO_FIGURAS {

    public static void main(String[] args) {
        /* Circulo[] circulos = new Circulo[10];
        //Un arreglo en java va de la posicion 0 a la posicion N-1
        //N es la cantidad de elementos del arreglo
        
        for(int i = 0; i < circulos.length; i++){
            circulos[i] = new Circulo(5); //Creamos cada uno de los objetos
            circulos[i].imprimirDatos(); 
        } */
        
        Figuras[] figuras; //Aclaramos el arreglo pero no lo hemos creado
        
        //Con el scanner capturamos la cantidad de figuras que quiere el usuario
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuántas figuras quieres capturar?");
        int cant  = input.nextInt(); //Permkite capturar
        figuras = new Figuras[cant]; //Creamos el arreglo. El tamaño es el capturado en cant
        
        for (int i=0; i<cant; i++){
            System.out.println("Captura el tipo de figura");
            System.out.println("1 = Círculo, 2 = Triángulo");
            int figu = input.nextInt();
            if(figu==1){//Círculo
                Circulo circu = new Circulo();
                System.out.println("Introduce el radio: ");
                circu.setRadio(input.nextDouble());
                figuras[i] = circu;
            }else{//Triángulo
                Triangulo tria = new Triangulo();
                System.out.println("Introduce la base: ");
                tria.setBase(input.nextDouble());
                System.out.println("Introduce la altura: ");
                tria.setAltura(input.nextDouble());
                figuras[i] = tria;
            } 
        }
        //Imprimir los resultados:
        for (int i = 0; i<figuras.length; i++){
            if(figuras[i] instanceof Circulo){
                //System.out.println("Círculo: ");
                Circulo circu = (Circulo)figuras[i]; //Casting
                circu.imprimirDatos();
                System.out.println("\n");
            }else{
                //System.out.println("Triángulo: ");
                Triangulo tria = (Triangulo)figuras[i];
                tria.imprimirDatos();
                System.out.println("\n");
            }
            //System.out.println("Area: " + figuras[i].calcularArea());
            //System.out.println("Perímetro: " + figuras[i].calcularPeri());
        }
    }
}
    


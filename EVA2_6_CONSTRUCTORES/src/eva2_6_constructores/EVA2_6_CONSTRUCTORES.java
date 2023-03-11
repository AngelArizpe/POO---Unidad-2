package eva2_6_constructores;

public class EVA2_6_CONSTRUCTORES {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        
        /*En este punto, al correr el programa, Java ejecuta tambien el constructor
        aunque nosotros no lo pusieramos, es decir, heredó también el constructor 
        de la clase padre animal (el constructor que indica que está vivo*/
        
        /*Es recomendable que esto lo hagamos nosotros en lugar de hacer que Java
        lo haga por nosotros, tecnicamente ns hizo un favor*/
        System.out.println("Mamifero:");
        Mamifero mamifero = new Mamifero();
               
    }
}

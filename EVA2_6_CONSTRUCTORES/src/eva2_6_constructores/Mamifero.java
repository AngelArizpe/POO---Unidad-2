package eva2_6_constructores;

public class Mamifero extends Animal{
    
    //Constructor de mamifero cualquiera
    public Mamifero(){
        System.out.println("Soy un mamifero");
    }
    
    public void parir(){
        System.out.println("No nacemos de huevo");
    }
    public void pelo(){
        System.out.println("Tenemos pelo");
    }
}

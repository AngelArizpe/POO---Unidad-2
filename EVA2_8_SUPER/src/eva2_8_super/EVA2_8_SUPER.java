package eva2_8_super;

public class EVA2_8_SUPER {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Joaquin",157);
        Mamifero mamifero1 = new Mamifero("Azul bebe retoño de manzana verde","Pancho Villa", 32);
        Canes can = new Canes();
    }
    
}
        
class Animal{
    private String nombre;
    private int peso;
    
    public Animal(){
        System.out.println("It's alive");
    }
    
    public Animal(String nombre, int peso){
        System.out.println("It's alive (cosntructor 2 - Animal)");
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void respirar(){
        System.out.println("Estoy respirando");
    }
}
class Mamifero extends Animal{
    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    public Mamifero(String colorPelo, String nombre, int peso) {
        //Lo primero en un constructor es llamar al constructor de la superclase
        //Si pusieramos el super abajo del this.colorPelo, marcaría error
        super(nombre, peso); //Llamda al constructor de la superclase
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero (constructor 2 - Mamifero)");
    }
    
        public Mamifero(){
            //super --> apunta a la superclase
            
            //Aquí está apuntando al método respirar de la clase:
            //super.respirar(); 
            
            //Llamada al constructor default de la superclase Animal
            super(); 
            System.out.println("Soy un mamifero");
                        /*Super también sirve para arreglar colisiones cuando tenemos 2 
            cosas llamadas igual en la superclase y la clase derivada*/
        }
    }
class Canes extends Mamifero{

    public Canes() {
        super();
        System.out.println("Soy un can");
    }
    
}

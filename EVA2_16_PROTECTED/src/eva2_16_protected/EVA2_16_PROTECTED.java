package eva2_16_protected;

public class EVA2_16_PROTECTED {

    public static void main(String[] args) {
        SuperClase objSuper = new SuperClase();
        objSuper.dato = 100;
    }
    
}

class SuperClase{
    protected int dato;
    
}

class SubClase extends SuperClase{
    public void imprimirDato(){
        System.out.println("El dato es:" + dato);
    }
}
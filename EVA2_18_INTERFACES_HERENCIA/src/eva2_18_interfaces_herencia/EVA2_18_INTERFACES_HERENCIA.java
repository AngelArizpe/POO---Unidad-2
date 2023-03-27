package eva2_18_interfaces_herencia;

public class EVA2_18_INTERFACES_HERENCIA {

    public static void main(String[] args) {
        
    }
    
}

interface interA{
    void A();
}

interface interB{
    void B();
}

interface interC extends interA, interB{
    void C();
}

class Prueba implements interC{

    @Override
    public void C() {
        
    }

    @Override
    public void A() {
         
    }

    @Override
    public void B() {
        
    }
    
}
package eva1_14_alcance2;

public class EVA1_14_ALCANCE2 {

    public static void main(String[] args) {
        int x = 100 //visible dentro de todo el bloque main
        for (int i = 0; i < 10; i++) {
            int x = 100; //no se puede declarar de nuevo porque si es visible en el bloque for
            int y = 100; //visible solo dentro del bloque for
            if(i==5){
                
            }
        }
        int y = 100; //puede declararse de nuevo fuera del for, porque solo ahi era visible la anterior
    } 
}

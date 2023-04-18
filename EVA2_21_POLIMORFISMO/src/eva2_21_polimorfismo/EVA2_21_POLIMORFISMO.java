package eva2_21_polimorfismo;

public class EVA2_21_POLIMORFISMO {

    public static void main(String[] args) {
        Estudiante estu = new Estudiante("Mario", "Bros", 34, "14");
        estu.imprimirDatos();
        Docente doce = new Docente("El bassa", "Bassaneti", 60, "No tiene");
        doce.imprimirDatos();
        //Puedo tratar a los objetos de las subclases como objetos de la superclase
        //No se puede al reves
        
        //Se esta asignando un objeto de tipo estudiante a una variable tipo persona
        Persona perso = estu;
        //Se está generalizando (simplificando
        //perso.
        
        Persona perso2 = doce;
        
        Persona persoPrueba = new Persona();
        //Docente docePrueba = persoPrueba; --> No se puede
        //No se puede convertir un objeto de una superclase a una variable de una subclase
        //Esto es porque Persona no tiene plaza y no puede sacarla de ningún lado
        //En cambio, cuando es al revés, el número de control no deja de existir, solo se oculta
        //No pueden agregarse cosas, simplemente ocultarse
        
        //Estudiante y docente son personas, pero una persona puede no ser uno de ellos
    }
    
}

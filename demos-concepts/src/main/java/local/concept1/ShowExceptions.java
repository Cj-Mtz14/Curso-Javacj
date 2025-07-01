package local.concept1;

// Ejemplos de excepciones de runtime.
//provocadas para probarlas.
//Código de errores.

public class ShowExceptions {

    String name = "Pepe";
    

    void make() {
        name.charAt(0);
    }


    public static void main(String[] args) {
        ShowExceptions se = new ShowExceptions();
        se.make();
    }
    

}

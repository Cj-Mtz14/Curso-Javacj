//Formas o tipos de imprimir en pantalla.

public class Out {

    public static void main(String[] args) {
        
        String name = "Pepe";
        String surname = "Pérez";
        int age = 33;

        String result = "Hola " + name + " " + surname + "\n¿como estás a tus" + age +" años?";
        System.out.println(result);


        System.out.println("Hola " + name + " " + surname + "\n¿como estás a tus" + age +" años?");

        //printf es otra manera de imprimir en pantalla

        System.out.printf("Hola %s %s\n¿como estás a tus %d años?\n", name, surname, age);

// esta es otra forma de imprimir en pantalla. en resumen serian 3. hacer con la que te sientas mas cómodo.
        System.out.println("""

        "Hola %s %s
        ¿como estás a tus %d años?"
                
                """.formatted (name, surname, age));
    }
    
}

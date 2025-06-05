

public class Out {

    public static void main(String[] args) {
        
        String name = "Pepe";
        String surname = "Pérez";
        int age = 33;


        System.out.println("Hola " + name + "" + surname + "\n¿como estás a tus" + age +" años?");

        //printf

        System.out.printf("Hola %s %s\n¿como estás a tus %d años?");

        System.out.println("""

        "Hola %s %s
        ¿como estás a tus %d años?"
                
                """.formatted (name, surname, age));
    }
    
}

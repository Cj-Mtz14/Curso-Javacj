
public class Person2 {
   
// Tipos de numeros
// byte - 1byte -128  - 127
// short - 2bytes
// int - 4bytes
// long - 8bytes
// float - decimal 4bytes
// double - decimal 8 bytes


     public static void main(String[]args) {

     byte age; // Declaracion
     age = 22; //Asignacion
     short birthYear = 1990; // Inicializacion =Declaracion + Asignacion
     int cityPopulation = 40_000_000;
     long countryPopulation = 40_000_000;
     float height = 1.78f;
     double weight = 65.74;
     boolean hasPet = true; 
     char type = 'A';
     String name = "Pepe";

     System.out.println("Edad " + age);
     System.out.println("Fecha" + birthYear);
     System.out.println("poblacion de mi ciudad " + cityPopulation);
     System.out.println("polacionde  mi pais " + countryPopulation);
     System.out.println("""
               Altura %1
               Peso %2
               ¿Mascotas? %s
               Tipo %s
               Nombre %s
               string
               """.formatted(height, weight, hasPet, type, name));
     }

}
package base;

public class Person {

    // Propiedades static o de clase

    public static int countInstances = 0;

    // Métodos static o de clase


    // Propiedades de instancia

    public String name;
    public int age;


    //public int getName() {
      //  return name;
    

   // public void setName(String name) {
        //this.name = name;
    


    //Métodos getters y setters
    public void setAge(int age) {
        if (age < this.age) {
            return;
        }
        this.age = age;
    }
    

// Método constructor
    public Person(String name, int age) {
        System.out.println("Se ha instancia una persona");

        this.name = name;
        this.age = age;

        Person.countInstances++;
    }
// Método de instancia. puede haber muchos o ninguno.
    public void greetings() {
        System.out.printf("Hola soy %s y tengo %s años.\n", name, age);


    }
    
}

import base.Person;

public class App {
    public static void main(String[] args) throws Exception {



        Person person1 = new Person("Cristian", 15);
        //Person.countInstances++;

        person1.greetings();
        person1.setAge(16);
        person1.greetings();


        //person1.name = "Cristian";
       // person1.age = 15;


        person1.greetings();


        Person person2 = new Person("Juan", 45);
        Person.countInstances++;

        person2.name = " Juan";
        person2.age = 45;
        person2.greetings();
        System.out.println(Person.countInstances);


    }
}

package animals;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    };

    public void eat() {
        String message = "Como comida para perros";
        System.out.println(message);

    }
}
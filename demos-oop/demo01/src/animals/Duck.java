package animals;

public class Duck implements IDuck, IBirds {

    @Override
    public void makeSound() {
        System.out.println("Ruido");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void swing() {
        System.out.println("Swinging");
    }

}
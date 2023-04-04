package FindAnimalName;

public class Cat extends Animal{

    public Cat() {
        name = new StringBuilder("cat");
        sound = new StringBuilder("meow");
    }

    @Override
    void movement() {
        System.out.println("Moves very fast");
    }

    @Override
    boolean isEdible() {
        return false;
    }

    @Override
    public boolean isTrue(StringBuilder guess) {
        return guess.compareTo(name) == 0;
    }
}

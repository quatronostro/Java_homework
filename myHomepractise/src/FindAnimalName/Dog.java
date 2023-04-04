package FindAnimalName;

public class Dog extends Animal{

    public Dog(){
        name = new StringBuilder("dog");
        sound = new StringBuilder("barf");
    }
    @Override
    void movement() {
        System.out.println("moves fast");
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

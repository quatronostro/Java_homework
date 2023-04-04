package FindAnimalName;

public class Cow extends Animal{

    public Cow(){
        name = new StringBuilder("cow");
        sound = new StringBuilder("Moo");
    }

    @Override
    void movement() {
        System.out.println("Moves very slow");
    }

    @Override
    boolean isEdible() {
        return true;
    }

    @Override
    public boolean isTrue(StringBuilder guess) {
        return guess.compareTo(name) == 0;
    }
}

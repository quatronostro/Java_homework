package FindAnimalName;

public class Sheep extends Animal{

    public Sheep(){
        name = new StringBuilder("sheep");
        sound = new StringBuilder("Mee");
    }

    @Override
    void movement() {
        System.out.println("Moves reagular");
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

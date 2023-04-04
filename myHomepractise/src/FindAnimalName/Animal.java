package FindAnimalName;

public abstract class Animal {

    protected StringBuilder name;

    protected StringBuilder sound;

    abstract void movement();

    abstract boolean isEdible();

    public abstract boolean isTrue(StringBuilder guess);

    public StringBuilder getSound() {
        return sound;
    }


}

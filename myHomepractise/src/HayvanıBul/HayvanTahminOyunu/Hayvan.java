package HayvanTahminOyunu;

public abstract class Hayvan {

    protected StringBuilder isim;

    protected StringBuilder ses;

    abstract void hareket();

    abstract boolean isYenir();

    public StringBuilder getSes() {
        return ses;
    }

    protected abstract boolean isDogruTahmin(StringBuilder tahmin);
}

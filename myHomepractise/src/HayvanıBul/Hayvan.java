package HayvanıBul;

abstract class Hayvan {
    protected StringBuilder isim;
    protected StringBuilder ses;

    abstract void hareket();

    abstract boolean isYenir();



    public StringBuilder getSes() {
        return ses;
    }

    public abstract boolean isDogruTahmin(StringBuilder tahmin);
}

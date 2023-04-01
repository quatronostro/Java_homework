package HayvanıBul;

public class Inek extends Hayvan{

    public Inek(){
        isim = new StringBuilder("inek");
        ses = new StringBuilder("möö");
    }

    @Override
    void hareket() {
        System.out.println("Yavaş hareket eder.");
    }

    @Override
    boolean isYenir() {
        return true;
    }

    @Override
    public boolean isDogruTahmin(StringBuilder tahmin) {
        int comp = 0;
        return tahmin.compareTo(isim) == comp;
    }
}

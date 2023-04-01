package HayvanıBul;

public class Kuzu extends Hayvan{

    public Kuzu(){
        isim = new StringBuilder("kuzu");
        ses = new StringBuilder("mee");
    }

    @Override
    void hareket() {
        System.out.println("Orta hızda hareket eder.");
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

package HayvanıBul;

public class Kedi extends Hayvan{

    public Kedi(){
        isim = new StringBuilder("kedi");
        ses = new StringBuilder("miyav");
    }

    @Override
    void hareket() {
        System.out.println("Çok hızlı hareket eder.");
    }

    @Override
    boolean isYenir() {
        return false;
    }

    @Override
    public boolean isDogruTahmin(StringBuilder tahmin) {
        int comp = 0;
        return tahmin.compareTo(isim) == comp;
    }
}

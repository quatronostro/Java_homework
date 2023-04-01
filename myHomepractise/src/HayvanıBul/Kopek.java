package HayvanıBul;

public class Kopek extends Hayvan{

    public Kopek(){
        isim = new StringBuilder("köpek");
        ses = new StringBuilder("hav hav");
    }

    @Override
    void hareket() {
        System.out.println("Hızlı hareket eder.");
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

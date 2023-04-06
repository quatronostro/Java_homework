package HayvanTahminOyunu;

public class Kopek extends Hayvan{

    public Kopek(){
        isim = new StringBuilder("köpek");
        ses = new StringBuilder("hav hav");
    }
    @Override
    void hareket() {
        System.out.println("Hızlı hareket eder");
    }

    @Override
    boolean isYenir() {
        return false;
    }

    @Override
    protected boolean isDogruTahmin(StringBuilder tahmin) {
        return tahmin.compareTo(isim) == 0;
    }
}

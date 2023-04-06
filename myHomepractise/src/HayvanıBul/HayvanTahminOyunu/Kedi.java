package HayvanTahminOyunu;

public class Kedi extends Hayvan{

    public Kedi(){
        isim = new StringBuilder("kedi");
        ses = new StringBuilder("miyav");
    }


    @Override
    void hareket() {
        System.out.println("Çok hızlı hareket eder");
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

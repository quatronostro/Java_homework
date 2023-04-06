package HayvanTahminOyunu;

public class Inek extends Hayvan{

    public Inek(){
        isim = new StringBuilder("inek");
        ses = new StringBuilder("möö");
    }
    @Override
    void hareket() {
        System.out.println("Az hareket eder");
    }

    @Override
    boolean isYenir() {
        return true;
    }

    @Override
    protected boolean isDogruTahmin(StringBuilder tahmin) {
        return tahmin.compareTo(isim) == 0;
    }
}

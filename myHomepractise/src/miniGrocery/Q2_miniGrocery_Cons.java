package C01_calisma;

public class Q2_miniGrocery_Cons {
    String vegyName;
    double kg = 1.0;
    double charge;

    public Q2_miniGrocery_Cons(String name, double price) {
        this.vegyName = name;
        charge = price;
    }

    static double totalFee;



    @Override
    public String toString() {
        return " List " + "[" +
                "Vegy name =' " + vegyName + '\'' +
                ", Kg = " + kg + " kg" +
                ", price = " + charge + " TL" +
                ']';
    }



}

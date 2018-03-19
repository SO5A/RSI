public class Miasto extends Calculate implements Print {
    private String nazwa_miasta;
    private double wielkosc;
    private Integer ludnosc;

    public String getNazwa_miasta() {
        return nazwa_miasta;
    }

    public Miasto(String nazwa_miasta) {
        this.nazwa_miasta = nazwa_miasta;
    }

    public Miasto() {
        this.nazwa_miasta = "";
        this.wielkosc = 10;
        this.ludnosc = 1;
    }

    public Miasto(String nazwa_miasta, double wielkosc, Integer ludnosc) {
        this.nazwa_miasta = nazwa_miasta;
        this.wielkosc = wielkosc;
        this.ludnosc = ludnosc;
    }

    @Override
    public void print() {
        System.out.println("Miasto: " + nazwa_miasta + "\n ");
    }
}

public class Miasto {
    public String getNazwa_miasta() {
        return nazwa_miasta;
    }

    public Miasto(String nazwa_miasta) {
        this.nazwa_miasta = nazwa_miasta;
    }

    private String nazwa_miasta;
    private double wilkosc;
    private Integer ludnosc;

    public Miasto(){
        this.nazwa_miasta = "";
        this.wilkosc = 10;
        this.ludnosc = 1;
    }
    public Miasto(String nazwa_miasta, double wilkosc, Integer ludnosc) {
        this.nazwa_miasta = nazwa_miasta;
        this.wilkosc = wilkosc;
        this.ludnosc = ludnosc;
    }
}

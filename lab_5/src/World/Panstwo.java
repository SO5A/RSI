package World;
import java.util.LinkedList;
import java.util.List;

public class Panstwo extends Calculate implements Print{
    private String nazwaPanstwa;
    private Integer wielkoscWKm2;
    private Integer liczbaMieszkancow;
    private List<Miasto> lista_miast  = new LinkedList();
    private String NajwiekszeRzeki[][] =new String[2][10];

    public Panstwo(String nazwaPanstwa, Integer wielkoscWKm2, Integer liczbaMieszkancow) {
        this.nazwaPanstwa = nazwaPanstwa;
        this.wielkoscWKm2 = wielkoscWKm2;
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    public Integer getWielkoscWKm2() {
        return wielkoscWKm2;
    }

    public Integer getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }

    public void setWielkoscWKm2(Integer wielkoscWKm2) {
        this.wielkoscWKm2 = wielkoscWKm2;
    }

    public void setLiczbaMieszkancow(Integer liczbaMieszkancow) {
        this.liczbaMieszkancow = liczbaMieszkancow;
    }

    public void dodajMiasto(Miasto o){
        lista_miast.add(o);
    }
    public void print(){
        System.out.println(nazwaPanstwa+" zajmuje "+wielkoscWKm2+"km^2. Zasiedja ja "+liczbaMieszkancow+" mieszkancow. W "+nazwaPanstwa+" sa nastepujace miasta:\n");
        for(int i=0;i<lista_miast.size();i++) {
            System.out.println(lista_miast.get(i).getNazwa_miasta()+"\n");
        }
        System.out.println("\nNajwieksze rzeki w panstwie");
        for (int i=0;i<10;i++){
            if(NajwiekszeRzeki[0][i]!=null) {
                System.out.println("\n"+NajwiekszeRzeki[0][i]+"    "+NajwiekszeRzeki[1][i]);
            }
        }
    }
    public String getNazwaPanstwa() {
        return nazwaPanstwa;
    }

    public Panstwo(String nazwaPanstwa) {
        this.nazwaPanstwa = nazwaPanstwa;

    }

    public void dodajRzeke(String nazwaRzeki, String wielkosc){

        for (int i=0;i<10;i++)
        {
            if(NajwiekszeRzeki[0][i]==null){
                NajwiekszeRzeki[0][i]=nazwaRzeki;
                NajwiekszeRzeki[1][i]=wielkosc;
                break;
            }
        }

    }
    public abstract void throwException() throws MyException.MyException;

}

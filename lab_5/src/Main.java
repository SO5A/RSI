import World.Miasto;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import World.Panstwo;
import MyException.ExceptionExample;

public class Main {
    public static void main(String[] args) {
        List<Panstwo> lista_panstw  = new LinkedList();
        int tmp;
        boolean loop = true;
        Panstwo newpanstwo1 = new Panstwo("Niemcy",350000,80000000);
            Miasto newmiasto1 = new Miasto("Berlin",100000,2000000);
            Miasto newmiasto2 = new Miasto("Hamburg",50000,900000);newpanstwo1.dodajMiasto(newmiasto1);

        newpanstwo1.dodajRzeke("Ren","1200km");
        newpanstwo1.dodajRzeke("Dunaj","3000km");
        newpanstwo1.dodajRzeke("łaba","1050km");
            newpanstwo1.dodajMiasto(newmiasto2);
        lista_panstw.add(newpanstwo1);

        Panstwo newpanstwo2 = new Panstwo("Slowacja",100000,5000000);
        Miasto newmiasto3 = new Miasto("Bratyslawa",100000,500000);
        Miasto newmiasto4 = new Miasto("Lewocza",10000,20000);
        newpanstwo2.dodajRzeke("Dunaj","3000km");
        newpanstwo2.dodajRzeke("Wrag","300km");

        newpanstwo2.dodajMiasto(newmiasto3);
        newpanstwo2.dodajMiasto(newmiasto4);
        lista_panstw.add(newpanstwo2);
        while (loop) {
            System.out.println("Menu:\n1.Utworz panstwo:\n2.stworz miasto:\n3.Wyswietl wszystko:\n4.Wyjście");
            Scanner scanner = new Scanner(System.in);
            tmp = scanner.nextInt();
            switch (tmp) {
                case 1:

                    System.out.println("Nazwa panstwa:");
                    String nazwa = scanner.next();
                    for(int i=0; i<lista_panstw.size();i++){
                        if(lista_panstw.get(i).getNazwaPanstwa().equals(nazwa)){
                            throw new IllegalArgumentException("Takie panstwo juz widnieje w systemie!");
                            break;
                        }
                    }
                    Panstwo nowePanstwo = new Panstwo(nazwa);
                    lista_panstw.add(nowePanstwo);
                    boolean secondloop=true;
                    while(secondloop) {
                        Scanner scan = new Scanner(System.in);
                        System.out.println("nie znam wiecej rzek: chce wyjsc (press 0) chce zostac (press 1)");
                        Integer x=scan.nextInt();
                    if(x==0){
                        break;
                    }
                        System.out.println("Podaj rzeke:");
                        String nazwaRzeki= scanner.next();
                        System.out.println("Podaj wielkosc tej rzeki:");
                        String wielkosc= scanner.next();
                        nowePanstwo.dodajRzeke(nazwaRzeki,wielkosc);
                    }
                    break;
                case 2:
                    System.out.println("Podaj nazwe miasta:");
                    String nazwaMiasta = scanner.next();
                    Miasto noweMiasto = new Miasto(nazwaMiasta);
                    System.out.println("World.Miasto jest w:");
                    for(int i=0; i<lista_panstw.size();i++){
                        System.out.println("\n"+i+". "+lista_panstw.get(i).getNazwaPanstwa());
                    }
                    int x = scanner.nextInt();
                    if(x>lista_panstw.size() && x<0){
                        throw new ExceptionExample().example();
                        break;
                    }
                    lista_panstw.get(x).dodajMiasto(noweMiasto);
                    break;
                case 3:
                    System.out.println("Wybierz  panstwo:");
                    for(int i=0; i<lista_panstw.size();i++){
                        System.out.println("\n"+i+". "+lista_panstw.get(i).getNazwaPanstwa());
                    }
                    int z = scanner.nextInt();
                    if(z>lista_panstw.size() && z<0){
                        System.out.println("????");
                        break;
                    }
                    lista_panstw.get(z).print();
                    break;
                default:
                    loop = false;
                    break;
            }
        }
    }
}

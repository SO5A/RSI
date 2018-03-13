import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Panstwo> lista_panstw  = new LinkedList();
        int tmp;
        boolean loop = true;

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
                            System.out.println("Takie panstwo juz widnieje w systemie!");
                            break;
                        }
                    }
                    Panstwo nowePanstwo = new Panstwo(nazwa);
                    lista_panstw.add(nowePanstwo);
                    boolean secondloop=true;
                    while(true) {
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
                    System.out.println("Miasto jest w:");
                    for(int i=0; i<lista_panstw.size();i++){
                        System.out.println("\n"+i+". "+lista_panstw.get(i).getNazwaPanstwa());
                    }
                    int x = scanner.nextInt();
                    if(x>lista_panstw.size() && x<0){
                        System.out.println("????");
                        break;
                    }
                    lista_panstw.get(x).dodajMiasto(noweMiasto);
                    break;
                case 3:
                    for(int i=0; i<lista_panstw.size();i++){
                        System.out.println("\n"+i+". "+lista_panstw.get(i).getNazwaPanstwa());
                    }
                    int z = scanner.nextInt();
                    if(z>lista_panstw.size() && z<0){
                        System.out.println("????");
                        break;
                    }
                    lista_panstw.get(z).pokazWszystko();
                default:
                    loop = false;
                    break;
            }
        }
    }
}

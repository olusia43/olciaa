import java.util.Scanner;

public class zad8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj liczbe zakupionych pakietow");
        double liczbaP = klawisz.nextDouble();
        klawisz.nextLine();
        double cena1P = 99;
        double koszt;
        double rabat;
        double kosztC;
        if(liczbaP<10) {
            koszt = liczbaP * 99;
            System.out.println("Koszt wynosi" + koszt);
        }
        if (liczbaP >= 10 && liczbaP <= 19) {
            rabat = (liczbaP*99) * 0.2;
            koszt = liczbaP * 99;
            kosztC = koszt - rabat;
            System.out.println("Koszt wynosi" + kosztC);
        }
        if (liczbaP >= 20 && liczbaP <= 49) {
            rabat = (liczbaP*99) * 0.3;
            koszt = liczbaP * 99;
            kosztC = koszt - rabat;
            System.out.println("Koszt wynosi" + kosztC);

        }
        if (liczbaP >= 50 && liczbaP <= 99) {
            rabat = (liczbaP*99) * 0.4;
            koszt = liczbaP * 99;
            kosztC = koszt - rabat;
            System.out.println("Koszt wynosi" + kosztC);
        }
        if (liczbaP > 100) {
            rabat = (liczbaP*99) * 0.5;
            koszt = liczbaP * 99;
            kosztC = koszt - rabat;
            System.out.println("Koszt wynosi" + kosztC);
        }
    }
}
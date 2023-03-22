import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj ilosc czekow wystawionych w miesiacu");
        double iloscC = klawisz.nextDouble();
        klawisz.nextLine();
        double oplata;
        if (iloscC < 20) {
            oplata = iloscC * 0.1 + 10;
            System.out.println(oplata);
        }
        if (iloscC >= 20 && iloscC <= 39) {
            oplata = iloscC * 0.08;
            System.out.println(oplata);
        }
        if (iloscC >= 40 && iloscC <= 59) {
            oplata = iloscC * 0.06;
            System.out.println(oplata);
        }
        if (iloscC >=60) {
            oplata = iloscC * 0.04;
            System.out.println(oplata);
        }
    }

}

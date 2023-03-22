import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj imie");
        String imie1 = klawisz.nextLine();
        System.out.println("Podaj czas ukonczenia biegu");
        double czas1 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj imie drugie");
        String imie2 = klawisz.nextLine();
        System.out.println("Podaj czas ukonczenia biegu");
        double czas2 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj imie trzecie");
        String imie3 = klawisz.nextLine();
        System.out.println("Podaj czas ukonczenia biegu");
        double czas3 = klawisz.nextDouble();
        klawisz.nextLine();
        if (czas1 < czas2 && czas1 < czas3) {
            System.out.println(imie1);
            if (czas2 < czas3) {
                System.out.println(imie2);
                System.out.println(imie3);
            }
            if (czas3 < czas2) {
                System.out.println(imie3);
                System.out.println(imie2);
            }


            if (czas2 < czas1 && czas2 < czas3) {
                System.out.println(imie1);
                if (czas1 < czas3) {
                    System.out.println(imie1);
                    System.out.println(imie3);
                }
                if (czas3 < czas1) {
                    System.out.println(imie3);
                    System.out.println(imie1);
                }
            }
        }

        if (czas3 < czas1 && czas3 < czas2) {
            System.out.println(imie1);
            if (czas1 < czas2) {
                System.out.println(imie1);
                System.out.println(imie2);
            }
            if (czas2 < czas1) {
                System.out.println(imie2);
                System.out.println(imie1);
            }
        }

    }
}



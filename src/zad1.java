import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        int dzien, miesiac, pierwszaL, drugaL;
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj dzień ");
        dzien = klawisz.nextInt();

        System.out.println("Podaj miesiac ");
        miesiac = klawisz.nextInt();

        System.out.println("Podaj pierwsza ostatnia cyfre roku");
        pierwszaL = klawisz.nextInt();

        System.out.println("Podaj druga ostatnia cyfre roku");
        drugaL = klawisz.nextInt();

        if ((dzien*miesiac)==(pierwszaL*drugaL)) {
            System.out.println("Data jest magiczna");
        }
               else {
                System.out.println("Data nie jest magiczna");
            }

        }
    }

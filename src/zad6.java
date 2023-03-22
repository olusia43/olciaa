import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj imie pierwsze");
        String imie1 =klawisz.nextLine();

        System.out.println("Podaj imie drugie");
        String imie2 = klawisz.nextLine();;


        System.out.println("Podaj imie trzecie");
        String imie3 = klawisz.nextLine();

        if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) < 0 ) {
            System.out.println(imie1 + " jest pierwszy alfabetycznie  ");
            if (imie2.compareToIgnoreCase(imie3) < 0) {
                System.out.println(imie2 + " jest drugi alfabetycznie  ");
                System.out.println(imie3 + " jest trzeci alfabetycznie  ");
            } else {
                System.out.println(imie3 + " jest drugi alfabetycznie  ");
                System.out.println(imie2 + " jest trzeci alfabetycznie  ");

            }

        } else if (imie2.compareToIgnoreCase(imie1) < 0 && imie2.compareToIgnoreCase(imie3) < 0) {
            System.out.println(imie2 + " jest pierwszy alfabetycznie  ");
            if (imie1.compareToIgnoreCase(imie3) < 0) {
                System.out.println(imie1 + " jest drugi alfabetycznie  ");
                System.out.println(imie3 + " jest trzeci alfabetycznie  ");
            } else {
                System.out.println(imie3 + " jest drugi alfabetycznie  ");
                System.out.println(imie1 + " jest trzeci alfabetycznie  ");

            }
        }













    }
}

import java.util.Scanner;

public class zad12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);


        System.out.println("Podaj powietrzeb/woda/stal");
        String slowo = klawisz.nextLine();
        System.out.println("Podaj odleglosc");
        double odleglosc = klawisz.nextDouble();
        klawisz.nextLine();
        double czas;

        if (slowo.equalsIgnoreCase("powietrze")) {
            czas = odleglosc / 343;
            System.out.println(czas);

        }
        if (slowo.equalsIgnoreCase("woda")) {
            czas = odleglosc / 1490;
            System.out.println(czas);

        }
        if (slowo.equalsIgnoreCase("stal")) {
            czas = odleglosc / 5100;
            System.out.println(czas);

        }
    }

}

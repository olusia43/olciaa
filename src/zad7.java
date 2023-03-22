import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj wage w kg");
        double waga = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj odleglosc");
        double odleglosc = klawisz.nextDouble();
        klawisz.nextLine();
        double oplata1= 1.10;

        double oplata2= 2.20;
        double oplata3= 3.70;
        double oplata4= 3.80;

        if (odleglosc <= 500 && waga <= 1) {
            double koszt = oplata1;
            System.out.println("Koszt wynosi" + koszt);
        }
        if (odleglosc <=500 && waga > 1 && waga<=3) {
            double koszt = oplata2;
            System.out.println("Koszt wynosi" + koszt);
        }
        if (odleglosc <= 500 && waga > 3 && waga<=5) {
            double koszt = oplata3;
            System.out.println("Koszt wynosi" + koszt);
        }
        if (odleglosc <= 500 && waga > 5) {
            double koszt = oplata4;
            System.out.println("Koszt wynosi" + koszt);
        }



        if (odleglosc > 500 && waga <= 1) {
            double koszt = oplata1 * 2;
            System.out.println("Koszt wynosi" + koszt);
        }
        if (odleglosc > 500 && waga > 1 && waga<=3) {
            double koszt = oplata2 * 2;
            System.out.println("Koszt wynosi" + koszt);
        }
        if (odleglosc > 500 && waga > 3 && waga<=5) {
            double koszt = oplata3 *2;
            System.out.println("Koszt wynosi" + koszt);
        }
        if (odleglosc > 500 && waga > 5) {
            double koszt = oplata4 * 2;
            System.out.println("Koszt wynosi" + koszt);
        }


    }

}

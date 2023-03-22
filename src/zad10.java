import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj kalorie");
        double kalorie = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj gramy tluszczu");
        double gramyT = klawisz.nextDouble();
        klawisz.nextLine();

        double kalorieZT = gramyT * 9;

        double procent = kalorieZT / kalorie;
        if (procent < 30 && kalorieZT <= kalorie) {
            System.out.println(procent);
            System.out.println("jest niskotluszczowy");
        }
        else {
            System.out.println("dane wejsciowe sa nieprawidlowe");
        }
    }
}

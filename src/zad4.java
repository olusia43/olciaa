import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj mase obiektu");
        double masaO = klawisz.nextDouble();
        klawisz.nextLine();
        double ciezar = masaO * 9.8;
        System.out.println(ciezar);
        if (ciezar > 1000) {
            System.out.println("Obiekt jest zbvyt ciezki");
        }
        else{
            System.out.println("Obiekt jest w porządku");
        }
        if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki");
        }

    }
}

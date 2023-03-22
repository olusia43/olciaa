import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj liczbe ksiazek");
        double liczbaK = klawisz.nextDouble();
        klawisz.nextLine();
        if(liczbaK==0){
            System.out.println("Punkty wynosza 0");
        }

        if(liczbaK==1){
            System.out.println("Punkty wynosza 5");
        }
        if(liczbaK==2){
            System.out.println("Punkty wynosza 15");
        }

        if(liczbaK==3){
            System.out.println("Punkty wynosza 30");
        }


        if(liczbaK==4){
            System.out.println("Punkty wynosza 60");
        }


        }
}

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj wynik 1 z testu");
        double wynik1 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj wynik 2 z testu");
        double wynik2 = klawisz.nextDouble();
        klawisz.nextLine();

        System.out.println("Podaj wynik z testu 3");
        double wynik3 = klawisz.nextDouble();
        klawisz.nextLine();

        double sumaT = 3;


        double srednia = (wynik1 + wynik2 + wynik3) / sumaT;
        System.out.println(srednia);
        if(srednia>=90 && srednia<=100){
            System.out.println("5");
        }
        if(srednia>=80 && srednia<=89){
            System.out.println("4");
        }
        if(srednia>=70 && srednia<=79){
            System.out.println("3");
        }
        if(srednia>=60 && srednia<=69){
            System.out.println("2");
        }
        if(srednia<60){
            System.out.println("1");
        }
    }

}

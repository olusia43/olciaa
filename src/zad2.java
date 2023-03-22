import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj wage");
        double waga = klawisz.nextDouble();
        klawisz.nextLine();
        System.out.println("Podaj wzrost");
        double wzrost = klawisz.nextDouble();

        klawisz.nextLine();
        double BMI = waga / wzrost;
        System.out.println("BMI wynosi:" + BMI);
        if (BMI>18.5 && BMI<=25){
            System.out.println("BMI jest w porządku ");
        }
            if(BMI < 18.5){
            System.out.println("Masz niedowagę");
        }
                if(BMI>25 ) {
                    System.out.println("masz nadwage");
                }

    }
}

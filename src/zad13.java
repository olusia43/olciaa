import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj odpowiedz (A,B,C)");
        String answer = scan.nextLine().toUpperCase();

        System.out.println("Podaj minuty");
        double minuty = klawisz.nextDouble();
        klawisz.nextLine();

        char litera = answer.charAt(0);
        int liczba = 5;
        String napis = " ";
        double cena1=39.99;
        double cena2=59.99;
        double cena3=69.99;
        double ponad;
        double koszt;
        switch (litera) {
            case 'A':
                if(minuty<=450) {
                    System.out.println(cena1);
                }
                else {
                    ponad = ((minuty - 450) * 0.45) + 39.99;
                    System.out.println(ponad);
                }
            case 'B':
                if(minuty<=900) {
                    System.out.println(cena2);
                }
                else {
                    ponad = ((minuty - 900) * 0.4) + 59.99;
                    System.out.println(ponad);
                }

                break;
            case 'C':
                System.out.println(cena3);
                break;
            default:
                System.out.println("Nieoczekiwany błąd. Kod błędu nieznany");
                break;
        }
    }
    }


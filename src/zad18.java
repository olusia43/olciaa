import java.util.Scanner;

public class zad18 {
public static void main(String[] args) {
    Scanner klawisz = new Scanner(System.in);

    System.out.println("Czy ktos z osob jest na diecie wegetarianskiej");
    String odp = klawisz.nextLine();
    System.out.println("Czy ktos z osob jest na diecie weganskiej");
    String odp1 = klawisz.nextLine();
    System.out.println("Czy ktos z osob jest na diecie bezglutenowej");
    String odp2 = klawisz.nextLine();

    if (odp.equalsIgnoreCase("tak") && odp1.equalsIgnoreCase("tak") && odp2.equalsIgnoreCase("tak")) {
        System.out.println("Kawiarnia na rogu, Kuchnia u szefa");
    }
    else if (odp.equalsIgnoreCase("nie") && odp1.equalsIgnoreCase("nie") && odp2.equalsIgnoreCase("nie")) {

        System.out.println("Luksusowe Burgery u Jarka,Pizzeria przy Dworcowej, Kawiarnia na rogu, Włoskie specjały, Kuchnia u szefa" );
    }
    else if (odp.equalsIgnoreCase("tak") && odp1.equalsIgnoreCase("nie") && odp2.equalsIgnoreCase("nie")) {

                System.out.println("Pizzeria przy Dworcowej, Kawiarnia na rogu, Włoskie specjały, Kuchnia u szefa" );
            }
else if (odp.equalsIgnoreCase("tak") && odp1.equalsIgnoreCase("tak") && odp2.equalsIgnoreCase("nie")) {

                    System.out.println(" Kawiarnia na rogu, Kuchnia u szefa" );
                }
else if (odp.equalsIgnoreCase("nie") && odp1.equalsIgnoreCase("tak") && odp2.equalsIgnoreCase("nie")) {

                        System.out.println("Kawiarnia na rogu, Kuchnia u szefa" );
                    }
                    else if (odp.equalsIgnoreCase("nie") && odp1.equalsIgnoreCase("tak") && odp2.equalsIgnoreCase("tak")) {

                            System.out.println("Kawiarnia na rogu, Kuchnia u szefa" );
                        }
           else if (odp.equalsIgnoreCase("nie") && odp1.equalsIgnoreCase("nie") && odp2.equalsIgnoreCase("tak")) {

                                    System.out.println("Pizzeria przy Dworcowej, Kawiarnia na rogu, Kuchnia u szefa");
                                }
                            else
                                if (odp.equalsIgnoreCase("tak") && odp1.equalsIgnoreCase("nie") && odp2.equalsIgnoreCase("tak")) {
                                    System.out.println("Pizzeria przy Dworcowej, Kawiarnia na rogu, Kuchnia u szefa");
                                }

                    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("""
                1. Parallelepiped:
                2. Cylinder: 
                """);

        String fygo = scanner.nextLine();


            try {
                Parallelepiped parallelepiped = new Parallelepiped();
                switch (fygo) {

                    case "1" -> {
                        System.out.println("Enter height");
                        parallelepiped.setHeight(scanner.nextInt());
                        System.out.println("Enter width");
                        parallelepiped.setWidth(scanner.nextInt());
                        System.out.println("Enter length");
                        parallelepiped.setLength(scanner.nextInt());


                        System.out.println("Aiynty: " + parallelepiped.Aiynt());
                        System.out.println("Kolomu: " + parallelepiped.Kolom());

                    }
                    case  "2" ->{
                        Cylinder cylinder = new Cylinder();
                        System.out.println("Enter radius: ");
                        cylinder.setRadius(scanner.nextDouble());
                        System.out.println("Enter height: ");
                        cylinder.setHeight(scanner.nextDouble());
                        System.out.println("Aiynty: " + cylinder.ayint());
                        System.out.println("kolom: "+ cylinder.kolom());
                    }

                }

            } catch (InputMismatchException e) {
                System.out.println(" Enter number ");

            }

        }
    }
}
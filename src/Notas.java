import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first note: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Write the second note: ");
        double nota2 = scanner.nextDouble();

        if((nota1 + nota2) / 2 >= 6.0){
            System.out.println("Congratulations, you passed");

        } else if ((nota1 + nota2) / 2 >= 5 && (nota1 + nota2) / 2 < 6 ) {
            System.out.println("You are in recovery");

        }

        else {
            System.out.println("You're reproved");
        }


    }
}

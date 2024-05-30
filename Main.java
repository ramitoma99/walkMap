import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to walkMap!");
        System.out.println("Enter world size: ");

        int size = scanner.nextInt();

        World world1 = new World(size);

        world1.displayWorld();

        System.out.println("Enter Player name: ");

        String name = scanner.nextLine();



    }

}

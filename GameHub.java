import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GameHub {

    public void start() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to walkMap!");
        System.out.println("Enter world size: ");

        int size = scanner.nextInt();

        #Empties input buffer after nextInt
        scanner.nextLine();

        World mainWorld = new World(size);

        mainWorld.displayWorld();

        System.out.println("Enter Player name: ");

        String name = scanner.nextLine();
        char nameInit = name.charAt(0);

        System.out.println("Enter Player x: ");

        int x = scanner.nextInt();

        System.out.println("Enter Player y: ");

        int y = scanner.nextInt();

        Player player = new Player(nameInit, x, y);

        mainWorld.setCell(player.getInitial(), player.getPosX(), player.getPosY());

        mainWorld.displayWorld();

    }

}

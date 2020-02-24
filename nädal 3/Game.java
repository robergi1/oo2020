import java.util.Scanner;

public class Game {

    public static void Game(String[] args){
        Character player = new Character("robert", CharacterType.GOBLIN);
        Character enemy = new Character("Uss", CharacterType.WIZARD);

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        System.out.println(first);

        player.slogan = "hey";

        player.move();

        player.move();
        player.move();
        player.move();
        player.move();
        player.move();

        String input = "";
        while(input.equals("end")){
            input = scanner.nextLine();

            if (input.equals()) player.move();
        } else if (input.equals("u")){
            player.changeDirection(Direction.UP);
            player.move();
        } else if (input.equals("d")){
            player.changeDirection(Direction.DOWN);
            player.move();
        } else if (input.equals("l")){
            player.changeDirection(Direction.LEFT);
            player.move();
        } else if (input.equals("r")){
            player.changeDirection(Direction.RIGHT);
            player.move();
        }

        if(player.x == enemy.x && player.y == enemy.y)
        
    }
}
import java.util.Scanner;

public class Game {
    public static void Start(){
        int myNumber = 10;
        double myMoney = 500;
        Scanner keyboard = new Scanner(System.in);

        double bet = 0;

        while (true){

            System.out.println("Whats ur number: ");
            myNumber = keyboard.nextInt();
            System.out.println("Bet amount: ");
            bet = keyboard.nextDouble();
            if(bet < myMoney && myNumber < 100){
                Round r = new Round(myNumber, bet);
                myMoney += r.GetBalance();
                System.out.println("You have "+myMoney);
            }else{
                System.out.println("You dont have enough krooni/Your number is too high");
            }

        }
    }
}
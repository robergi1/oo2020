import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        boolean angry;
        Fox fox = new Fox();
        Cow cow = new Cow();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is this animal dangerous?");
        String input = scanner.next();

        if(input.equals("y")){
            angry = true;
        } else {
            angry = false;
        }

        fox.sleep(6);
        fox.attack(angry);
        fox.speak();
        System.out.println();
        cow.sleep(14);
        cow.attack(angry);
        cow.speak();
        


        System.out.println("Sisesta oma isikukood");

        Scanner sc2 = new Scanner(System.in);
        ESTCode test = new ESTCode();
        String personalCode = sc2.next();
        test.getGender(personalCode);
        test.getYear(personalCode);
        test.getBirthday(personalCode);


        scanner.close();
        sc2.close();
    }
    
}
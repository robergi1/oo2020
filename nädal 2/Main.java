public class Main {

    public static void main(String[] args){
        Character robert = new Character("robert", CharacterType.GOBLIN);
        Market shop = new Market("shop", MarketType.WEAPONS);

        robert.slogan = "Hey";
        robert.height = 193;

        System.out.println(robert);
        System.out.println(shop);
        
    }
}
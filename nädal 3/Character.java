public class Character {

    private int x;
    private int y;

    public String slogan = "";

    private String name;
    private CharacterType characterType;
    public Direction direction;
    private Inventory inventory;

    public Character(String name, CharacterType characterType){
        this.name = name;
        this.characterType = characterType;

        this.x = 30;
        this.y = 30;
    }

    

    @Override
    public String toString(){
        return "My name is " + name + " and i am at x:" + x + " y:" + y + " and my slogan is:" + slogan;

    }
    void changeDirection(Direction direction){
        this.direction = direction;
}

    void move(){
        
        switch(this.direction){
            case UP:
                this.y++;
                break;
            case RIGHT:
                this.x++;
                break;
            case LEFT:
                this.y--;
                break;
            case DOWN:
                this.x--;
                break;
            default:

                break;
        }
        
        System.out.println(getXY());
    }
}
public class Market {

    private int x;
    private int y;

    private String name;
    private MarketType marketType;

    public Market(String name, MarketType marketType){
        this.marketType = marketType;
        this.name = name;

        this.x = 10;
        this.y = 15;
    }

    @Override
    public String toString(){
        return "market name is " + name + " and its location is at x:" + x + " y:" + y + " and we sell " + marketType;

    }
}
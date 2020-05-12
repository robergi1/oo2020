public class Test{
    public static void main(String[] arg){
        Machine audi = new Car();
        audi.run();
        audi.changegear(1);
        audi.whatgear();
        audi.changegear(2);
        audi.whatgear();
    }
}
public class Car implements Machine{
    int gear;
    public void run(){
        System.out.println("Auto pandi käima!");
    }

    public void changegear(int newgear){
        gear = newgear;
    }

    public void whatgear(){
        System.out.println("Uus käik on " + gear);
    }

}
public class Cow implements Animal {

    public void speak() {
        System.out.println("Cow does MOO");
    }


    public void sleep(int hours) {
        System.out.println("Cows sleep usualy "+ hours + " hour");
    }



    public void attack(boolean isdangerous) {

        if(isdangerous == false){
            System.out.println("This cow isn't dangerous"); 
        } else {
            System.out.println("This cow is dangerous");
        }
    }

    
}
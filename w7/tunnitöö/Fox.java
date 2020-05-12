public class Fox implements Animal {

    @Override
    public void speak() {
        System.out.println("Fox does qua");
    }

    @Override
    public void sleep(int hours) {
        System.out.println("Fox usualy sleeps "+ hours + " hour");

    }


    @Override
    public void attack(boolean isdangerous) {
        if(isdangerous = false){
            System.out.println("This fox isn't dangerous"); 
        } else {
            System.out.println("This fox is dangerous");
        }
    }

    
}
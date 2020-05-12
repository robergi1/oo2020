public class Child extends Parent{
    
    public Child(String name, int age){
        super(name, age);
        this.Independent = false;
    }
    
    public void speak(){
        super.speak();
        System.out.println("\nGuguGaga");
    }

}
public class Parent {

    public String name;
    public int age;

    public boolean Independent;

    public Parent(String name, int age){
        this.name = name;
        this.age = age;
        this.Independent = true;
    }

    public void speak(){
        System.out.println("Minu nimi on " + this.name + ", ma olen " + this.age + "aastat vana ja minu iseseisvus on " + this.Independent);
    }
    
}
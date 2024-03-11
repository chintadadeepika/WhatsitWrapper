abstract class Animal{
    abstract void walk();
    public void eats(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Horse walks");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken walks");
    }
}

public class OOPS {
    public static void main(String[] args) {
       Horse h1 = new Horse();
       h1.walk();
       h1.eats();

    }
}

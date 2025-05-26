public class AbstractClasses {
    public static void main(String[] args) {
        monkey m1=new monkey();
        m1.walk();
        m1.eat();

    }
}
abstract class animal{
    animal(){
        System.out.println("animal constructer called");
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
    class deer extends animal{
        void walk(){
            System.out.println("on 4 legs");
        }
    }
    class monkey extends animal{
        void walk(){
            System.out.println("Walk on 2 legs");
        }
    }

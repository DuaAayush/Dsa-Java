

//////methot overloading compile time polymorphism

// public class Polymorphisms {
//     public static void main(String[] args) {
//         Sum digit=new Sum();
//         System.out.println(digit.sum(10,15));
//         System.out.println(digit.sum(10,15,35));
//     }
// }
// class Sum{
//     int sum(int a,int b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }
// }

///method overloading run time polymorphism

public class Polymorphisms {
    public static void main(String[] args) {
        Deer digit=new Deer();
        digit.eats();
    }
}
class Animal{
    void eats(){
        System.out.println("eat anuthing");
    }

}
class Deer extends Animal{
    void eats(){
        System.out.println("eat grass");
    }
}
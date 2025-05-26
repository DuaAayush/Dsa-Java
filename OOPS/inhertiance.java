////////////SIngle level Inheritance//////////
/// papa and bcha bssss

// public class inhertiance {
//     public static void main(String[]args){
//         Female Her=new Female();
//         Her.name();
//         Her.breathe();

//         Male His=new Male();
//         His.name();
//         His.eats();

//     }
// }

// class Human{
//     void breathe(){
//         System.out.println("Human is breathing. .. ... .... .....");
//     }
//     void eats(){
//         System.out.println("Human is eating. .. ... .... .....");
//     }
// }
// class Male extends Human{
//     void name(){
//         System.out.println("Aayush");
//     }
// }

//////////// Multilevel Inheritance/////////////
/// ek ke bad ek line me lekin single line

// public class inhertiance {
//     public static void main(String[]args){
//         Aayush Dua=new Aayush();
//         Dua.LastName="Dua";
//         Dua.breathe();
//         Dua.print();

        

//     }
// }
// class Human{
//     void breathe(){
//         System.out.println("Human is breathing. .. ... .... .....");
//     }
//     void eats(){
//         System.out.println("Human is eating. .. ... .... .....");
//     }
// }
// class Male extends Human{
//     void name(){
//         System.out.println("Aayush");
//     }
// }
// class Aayush extends Male{
//     String LastName;
//     void print(){
//     System.out.println("Aayush "+LastName);
//     }
// }

////////////hierarchial Inheritance//////////
/// tree bnta h

// public class inhertiance {
//     public static void main(String[]args){
//         Aayush Dua=new Aayush();
//         Dua.LastName="Dua";
//         Dua.breathe();
//         Dua.print();

    
//     }
// }
// class Human{
//     void breathe(){
//         System.out.println("Human is breathing. .. ... .... .....");
//     }
//     void eats(){
//         System.out.println("Human is eating. .. ... .... .....");
//     }
// }
// class Male extends Human{
//     void name(){
//         System.out.println("Aayush");
//     }
// }

// class Female extends Human{
//     void name(){
//         System.out.println("Simran");
//     }
// }

//////Hybrid Inheritancee////////
/// kuch bhi chlta h

public class inhertiance {
    public static void main(String[]args){
        Aayush Dua=new Aayush();
        Dua.LastName="Dua";
        Dua.breathe();
        Dua.print();

        

    }
}
class Human{
    void breathe(){
        System.out.println("Human is breathing. .. ... .... .....");
    }
    void eats(){
        System.out.println("Human is eating. .. ... .... .....");
    }
}
class Male extends Human{
    void name(){
        System.out.println("Aayush");
    }
}

class Female extends Human{
    void name(){
        System.out.println("Simran");
    }
}
class Aayush extends Male{
    String LastName;
    void print(){
    System.out.println("Aayush "+LastName);
    }
}
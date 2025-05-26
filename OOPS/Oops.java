public class oops{

    public static void main(String[]args){
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(3);
        System.out.println(p1.tip);
        p1.color="yellow";
        System.out.println(p1.color);

        //BankAccount
        BankAccount B1=new BankAccount();
        B1.setPassword("Hello");
        //B1.Password=("hellooooo"); give error as private
        

        Pencil pe1=new Pencil();
        pe1.setColor("blue");
        pe1.setTip(4);
        System.out.println(pe1.getTip());
        System.out.println(pe1.getColor());

        //constructer
        Office emp1=new Office(20,"aayush");
        System.out.println(emp1.name);
        System.out.println(emp1.id);
    }
}
class Pencil{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class BankAccount{
    public String username;
    private String Password;
    void setPassword(String pwd){
        Password=pwd;
    }

}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int physics, int chemistry,int maths){
        percentage=(physics +chemistry+maths)/3;

    }



}


class Office{
    int id;
    String name;
    Office(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("This is the constructer");
    }
}

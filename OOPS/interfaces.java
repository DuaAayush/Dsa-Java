public class interfaces {
    public static void main(String[] args) {
        striker a=new striker();
        a.moves();
        a.strikes();
    }
}
interface chessPlayer{
    void moves();
}
interface carromPlayer{
    void strikes();
}
class queen implements chessPlayer{
    public void moves(){
        System.out.println("movessssssss....");
    }
}
class striker implements chessPlayer, carromPlayer{
    public void moves(){
        System.out.println("moves");
    }
    public void strikes(){
        System.out.println("strikes");
    }
}


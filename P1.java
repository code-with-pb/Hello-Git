import java.util.*;

class P1{
    int a,b,c;
    void val(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd No: ");
        b = sc.nextInt();
    }
    void add(){
        c = a + b;
    }
    void show(){
        System.out.println(c);
    }
    public static void main(String args[]){
        P1 o = new P1();
        o.val();
        o.add();
        o.show();
    }
}
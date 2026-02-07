
public class Logical{
    public static void main(String[] args) {
        int a=90;
        int b=100;
        boolean c=true;
        if(a<=b && b>=a){
            System.out.println("first");
        }
        else if(a<=b  || b<=a)
        {
        System.out.println("Second");
        }
        else if (!c){
            System.out.println("~c");
        }
    }
}
import java.util.*;
public class Printpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printpattern(sc.nextInt());
    }
    public static void printpattern(int n){
        if(n<0){
            System.out.println(n);return;
        }
        System.out.println(n);
        printpattern(n-5);
        System.out.println(n);
    }
}

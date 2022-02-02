import java.util.*;
public class Printodddecreasingevenincreasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printid(n);
    }
    public static void printid(int n){
        if(n==0)return;
        if(n%2!=0)System.out.println(n);
        printid(n-1);
        if(n%2==0)System.out.println(n);
    }
}

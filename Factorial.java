/**
 * Factorial
 */
import java.util.*;
public class Factorial {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fact(n));
}
public static int fact(int n){
    if(n==1)return n;
    return n*fact(n-1);
}
    
}
import java.util.*;
public class PrintZigzag {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     zigzagboi(n);   
    }    
    public static void zigzagboi(int n)
    {
        if(n==0)return;
        System.out.println(n);
        zigzagboi(n-1);
        System.out.println(n);
        zigzagboi(n-1);
        System.out.println(n);
    }
}

import java.util.*;
/**
 * Print decreasing
 */
public class Printdecreasing {

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printdecreasing(n);

}
public static void printdecreasing(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    // these doesn't work
    //1.printdecreasing(n--);
    // 2.int n=n--; printdecreasing(n);
    printdecreasing(n-1);
}
}

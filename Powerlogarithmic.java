import java.util.*;
public class Powerlogarithmic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(power(x,n));
    }
    public static double power(int x, int n){
        if(n==0) return 1;
        // else if(n%2==0)return power(x,n/2)*power(x,n/2);
        // else return (x*power(x,n/2)*power(x,n/2));
        if(n<0) return 1/power(x,-n);
        double x1=power(x,n/2);
        double xnbp=x1*x1;
        if(n%2!=0)xnbp=xnbp*x;
        return xnbp;
    }
}

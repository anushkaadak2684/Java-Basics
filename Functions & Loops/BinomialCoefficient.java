import java.util.*;
public class BinomialCoefficient {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        return f;
    }

    public static void binomialCoefficient(int n, int r){
        int res = fact(n)/(fact(r)*fact(n-r));
        System.out.println("Binomial Coefficient: "+ res);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter r: ");
        int r = in.nextInt();
        binomialCoefficient(n,r);
        in.close();
    }
}

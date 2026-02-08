import java.util.*;
public class PrimeOptimized {
    public static boolean isPrime (int n){
        if (n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        if (isPrime(n) == true)
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");
        in.close();
    }
}

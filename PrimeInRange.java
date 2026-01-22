import java.util.*;
public class PrimeInRange {
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

    public static void isPrimeInRange(int n){
        for(int i=2;i<=n;i++){
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        isPrimeInRange(n);
        in.close();
    }
}

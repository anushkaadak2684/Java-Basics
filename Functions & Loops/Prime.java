import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        boolean isPrime = true;
        if (n==2){
            isPrime = true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime == true)
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");
        in.close();
    }
}

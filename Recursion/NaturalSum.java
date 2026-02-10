import java.util.*;
public class NaturalSum{
    public static int sum(int n){
        if(n==0 || n==1){
            return n;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Sum: " + sum(n));
        in.close();
    }
}


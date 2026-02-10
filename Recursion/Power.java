import java.util.*;
public class Power{
    public static int power(int n, int e){
        if(e==1){
            return n;
        }
        return n*power(n, e-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.print("Enter an exponent: ");
        int e = in.nextInt();
        System.out.println("Result: " + power(n, e));
        in.close();
    }
}


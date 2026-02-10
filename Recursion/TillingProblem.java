import java.util.*;
public class TillingProblem{
    public static int totalways(int n){
        if (n == 0 || n == 1)
            return 1;
        return totalways(n-1) + totalways(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n for the size of the board: ");
        int n = in.nextInt();
        System.out.println("Total ways tiles can be arranged: " + totalways(n));
        in.close();
    }
}
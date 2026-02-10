import java.util.*;
public class FriendsPairing{
    public static int totalways(int n){
        if (n == 1 || n == 2)
            return n;
        return totalways(n-1) + (n-1)*totalways(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of friends: ");
        int n = in.nextInt();
        System.out.println("Total ways of possible pairs: " + totalways(n));
        in.close();
    }
}
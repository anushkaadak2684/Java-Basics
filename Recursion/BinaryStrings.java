import java.util.*;
public class BinaryStrings{
    public static void printbinary(int n, int lp, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printbinary(n-1, 0, str+"0");
        if(lp != 1)
            printbinary(n-1, 1, str+"1");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str="";
        System.out.print("Enter the size of the strings: ");
        int n = in.nextInt();
        printbinary(n, 0, str);
        in.close();
    }
}

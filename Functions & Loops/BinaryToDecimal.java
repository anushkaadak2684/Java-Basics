import java.util.*;
public class BinaryToDecimal{
    public static void binaryToDecimal(int n){
        int pow=0, decimal=0,r;
        while(n>0){
            r=n%10;
            decimal+=r*Math.pow(2,pow);
            n=n/10;
            pow++;
        }
        System.out.print("Decimal number: "+decimal);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int n=in.nextInt();
        binaryToDecimal(n);
        in.close();
    }
}
import java.util.*;
public class DecimalToBinary{
    public static void decimalToBinary(int n){
        int pow=0, binary=0,r;
        while(n>0){
            r=n%2;
            binary+=r*Math.pow(10,pow);
            n=n/2;
            pow++;
        }
        System.out.print("Binary number: "+ binary);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n=in.nextInt();
        decimalToBinary(n);
        in.close();
    }
}
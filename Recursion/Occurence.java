import java.util.*;
public class Occurence{
    public static int firstOccurence(int arr[], int i, int n){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == n){
            return i;
        }
        return firstOccurence(arr, i+1, n);
    }

    public static int lastOccurence(int arr[], int i, int n){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, i+1, n);
        if(isFound == -1 && arr[i] == n){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter an array to check first and last occurence: ");
        for(int i=0; i<5; i++)
            arr[i] = in.nextInt();
        System.out.print("Enter the number whose occurence is to be searched: ");
        int n = in.nextInt();
        System.out.println("First Occurence: " + firstOccurence(arr, 0, n));
        System.out.println("Last Occurence: " + lastOccurence(arr, 0, n));
        lastOccurence(arr, 0, n);
        in.close();
    }
}



import java.util.*;
public class SortedArray{
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.print("Enter an array: ");
        for(int i=0; i<5; i++)
            arr[i] = in.nextInt();
        if(isSorted(arr, 0))
            System.out.println("Sorted array");
        else
            System.out.println("NOT a sorted array");
        in.close();
    }
}


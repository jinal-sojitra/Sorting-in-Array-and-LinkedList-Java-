import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JINAL SOJITRA
 */
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        System.out.print("Array after Sorting: ");
        System.out.println(Arrays.toString(arr));
        
    }
    
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;
            }
        }
    }
}

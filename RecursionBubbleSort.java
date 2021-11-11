import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JINAL SOJITRA
 */
public class BubbleSortRecursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSortRec(arr,n-1,0);
        System.out.print("Array after Sorting: ");
        System.out.println(Arrays.toString(arr));
        
    }
    
    static void bubbleSortRec(int[] arr,int r,int c){
        if(r==0)
            return;
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubbleSortRec(arr,r,c+1);
        }
        else{
            bubbleSortRec(arr,r-1,0);
        }
    } 
}

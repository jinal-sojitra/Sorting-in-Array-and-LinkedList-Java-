import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JINAL SOJITRA
 */
public class SelectionSortRecursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSortRec(arr,n,0,0);
        System.out.print("Array after Sorting: ");
        System.out.println(Arrays.toString(arr));
        
    }
    
    static void selectionSortRec(int[] arr,int r,int c,int max){
        if(r==0)
            return;
        if(c<r){
            if(arr[c]>arr[max]){
                max=c;
            }
            selectionSortRec(arr,r,c+1,max);
        }
        else{
            int temp=arr[r-1];
            arr[r-1]=arr[max];
            arr[max]=temp;
            selectionSortRec(arr,r-1,0,0);
        }
    }
}

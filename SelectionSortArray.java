import java.util.Scanner;

/**
 *
 * @author JINAL SOJITRA
 */
public class SelectionSort {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of your array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.print("Enter Elements of your array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(a[j]<a[min])
                    min=j;
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.print("Array after Sorting: ");
        for(int i:a){
            System.out.print(i+" ");
        }
}
}

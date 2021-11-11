import java.util.Scanner;

/**
 *
 * @author JINAL SOJITRA
 */
public class CountingSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] sorted=new int[n];
        System.out.print("Enter Elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int j=0;
        for (int i:arr){
            if(i>max){
                max=i;
            }  
        }
        int cn=max+1;
        int[] counts=new int[cn];
        for(int i:arr){
            counts[i]++;
        }
        
        for(int i=0;i<cn;i++){
            while(counts[i]>0){
                sorted[j]=i;
                counts[i]--;
                j++;
            }
            
        }
        
        System.out.print("Sorted Array: ");
        for(int i:sorted){
            System.out.print(i+" ");
        }
    }
}

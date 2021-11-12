/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava.Algorithms;

import static apnikakshajava.Algorithms.BubbleSortRecursion.bubbleSortRec;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class MergeSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(mergeSort(arr)));
        
    }
    
    static int[] mergeSort(int[] arr){
        if(arr.length==1)
            return arr;
        int mid=arr.length/2;
        
        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left,right);
    }
    
    static int[] merge(int[] first,int[] second){
        int[] sorted=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                sorted[k]=first[i];
                i++;
            }
            else{
                sorted[k]=second[j];
                j++;
            }
            k++;
        }
        
        while(i<first.length){
            sorted[k]=first[i];
            i++;
            k++;
        }
        
        while(j<second.length){
            sorted[k]=second[j];
            j++;
            k++;
        }
        return sorted;
    }
}

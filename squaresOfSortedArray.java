
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author misba zaidi
 */
public class squaresOfSortedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int[] ans=(squaresOfSortedArray(arr,n));
        for(int i:ans){
            System.out.print(i+" ");
        }
        //System.out.print
    }

    private static int[] squaresOfSortedArray(int[] arr, int n) {
        int ans[]=new int[n];
        int index=n-1;
        int i=0;
        int j=n-1;
        while(i<=j){
            int val1=arr[i]*arr[i];
            int val2=arr[j]*arr[j];
            if(val1>=val2){
                i++;
                ans[index]=val1;
            }
            else{
                ans[index]=val2;
                j--;
                
            }index--;
        }
        return ans;
           }
    
}

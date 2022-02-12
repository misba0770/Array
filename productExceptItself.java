
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
public class productExceptItself {

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
        long[] ans=product(arr,n);
        for(long x:ans){
            System.out.print(x+" ");
        }
    }
    static long[] product(int[] nums,int n){
          long[] ans=new long[n];
        long[] right=new long[n];
       
      long prod=1;
        for(int j=n-1;j>=0;j--){
            prod*=nums[j];
            right[j]=prod;
        }
         prod=1;
        for(int i=0;i<n-1;i++){
            ans[i]=prod*right[i+1];
            prod*=nums[i];
        }
        ans[n-1]=prod;
        return ans;
    }
    
}

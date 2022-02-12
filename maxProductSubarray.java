
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
public class maxProductSubarray {

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
        System.out.print(solve(arr,n));
    }

    private static long solve(int[] arr, int n) {
       long ans=Integer.MIN_VALUE;
       long prod=1;
       for(int i=0;i<n;i++){
           prod=prod*arr[i];
           if(ans<prod)ans=prod;
           if(prod==0)prod=1;
       }
    
    prod=1;
    for(int i=n-1;i>=0;i--){
    prod=prod*arr[i];
    if(ans<prod)ans=prod;
    if(prod==0)prod=1;
    }
    return ans;
    
}
    
}

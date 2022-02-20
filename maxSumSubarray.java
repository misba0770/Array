
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
public class maxSumSubarray {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int max=0;
       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       } 
       int k=s.nextInt();
       for(int i=0;i<n-k+1;i++){
           int c=0;int j=i;int sum=0;
           while(c!=k){
               sum+=arr[j];
               j++;
               c++;
               
           }
           max=Math.max(max,sum);
       }
       System.out.print(max);
        
    }
    
}

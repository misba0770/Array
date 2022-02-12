
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
public class maxWater {

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
        System.out.print(maxWater(arr,n));

    }

    private static long maxWater(int[] arr, int len) {
        long ans=0;
       int i=0;
       int j=len-1;
       while(i<j){
           int width=j-i;
           int ht=Math.min(arr[i],arr[j]);
           ans=Math.max(ans,width*ht);
           if(arr[i]<=arr[j])i++;
           else j--;
       }
       return ans;
        
    }
    
}

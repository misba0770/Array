
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
public class partitionDisjoint {

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
        System.out.print(partitionDisjoint(arr,n));
    }

    private static int partitionDisjoint(int[] arr, int n) {
     
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int[] rightMin=new int[n+1];
       rightMin[n]=Integer.MAX_VALUE;
       for(int i=n-1;i>=0;i--){
           rightMin[i]=Math.min(rightMin[i+1], arr[i]);
       }
       int leftMax=Integer.MIN_VALUE;
       int ans=0;
       for(int i=0;i<n;i++){
           leftMax=Math.max(leftMax,arr[i]);
           if(leftMax<rightMin[i+1]){
               ans=i;
               break;
           }
       }
       return ans+1;
    }
    
}

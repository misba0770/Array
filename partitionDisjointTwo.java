
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
public class partitionDisjointTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print(partitionDisjointTwo(arr,n));
    }

    private static int partitionDisjointTwo(int[] arr, int n) {
     
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      int leftMax=arr[0];
      int greater=arr[0];
      int ans=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]>greater)greater=arr[i];
          else if(arr[i]<leftMax){
              leftMax=greater;
              ans=i;
          }
      }return ans+1;
    }
    
}

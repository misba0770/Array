
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
public class sortArrayEvenOdd {

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
        int[] ans=solve(arr,n);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }

    private static int[] solve(int[] arr, int n) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int i=0;
       int j=0;
       while(i<n){
           if(arr[i]%2==0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j++;
                    
           }
           else{
               i++;
           }
       }
       return arr;
    }
    
}

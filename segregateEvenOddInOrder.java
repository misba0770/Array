
import java.util.Arrays;
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
public class segregateEvenOddInOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner s=new Scanner(System.in);
         int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int j=0;
           Arrays.sort(arr);
       for (int i=0;i<n;i++){
          if(arr[i]%2==0){
             
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  j++;
              
          }
          
       }
           Arrays.sort(arr,j,n);
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

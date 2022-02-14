
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
public class SegregateZeroOne {

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
        int left=0;
        int right=n-1;
        while(left<right){
            while(left<right&&arr[left]!=1)left++;
            while(left<right&&arr[right]!=0)right--;
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

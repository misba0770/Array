
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
public class wiggleSort1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //a<=b>=c<=d>=e<=f
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        wiggleSort(arr,n);
        for(int j:arr){
            System.out.print(j+" ");
        }
        
    }

    private static void wiggleSort(int[] arr,int n) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1])swap(arr,i,i+1);
            }
            else {
                if(arr[i]<arr[i+1])swap(arr,i,i+1);
            }
        }
        
    }

    private static void swap(int[] arr, int i, int j) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}

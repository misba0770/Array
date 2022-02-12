
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
public class mooreVoting {

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
        System.out.print(mooreVoting(arr,n));
    }

    private static int mooreVoting(int[] arr, int n) {
        int val=arr[0];
        int count=1;
        for(int i=0;i<n;i++){
            if(arr[i]==val)count++;
            else count--;
            if(count==0){
                count=1;
                val=arr[i];
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(val==arr[i])c++;
        }
        if(c>n/2)return val;
        else return -1;
    }
    
}

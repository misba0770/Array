
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
public class maxProductOfThreeNumbers {

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

    private static int solve(int[] arr, int n) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int min1=Integer.MAX_VALUE;
        int min2=min1;
        int max1=Integer.MIN_VALUE;
        int max2=max1;
        int max3=max1;
        for(int i=0;i<n;i++){
            int val=arr[i];
            if(val>=max1){
                max3=max2;
                max2=max1;
                max1=val;
            }
            else if(val>=max2){
                max3=max2;
                max2=val;
            }
            else if(val>=max3) {
                max3=val;
            }
            if(val<=min1){
                min2=min1;
                min1=val;
            }else if(val<=min2){
                min2=val;
            }
        }
        return Math.max(min1*min2*max1, max1*max2*max3);
    }
    
}

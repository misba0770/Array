
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
public class minPlatforms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int dept[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            dept[i]=s.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(dept);
        System.out.print(minPlatforms(arr,dept,n));
    }

    private static int minPlatforms(int[] arr, int[] dept, int n) {
       int maxTrains=0;
       int platforms=0;
       int i=0,j=0;
       while(i<n&&j<n){
           if(arr[i]<=dept[j]){
               maxTrains++;
               i++;
           }
           else{
               maxTrains--;
               j++;
           }
           platforms=Math.max(platforms,maxTrains);
       }
       return platforms;
    }
    
}

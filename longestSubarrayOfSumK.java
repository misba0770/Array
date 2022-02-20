
import java.util.HashMap;
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
public class longestSubarrayOfSumK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here'i
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        System.out.print(sol(arr,k));
    }

    private static int sol(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                max=Math.max(i+1,max);
            }
            else if(map.containsKey(sum-arr[i])){
                max=Math.max(max,i-map.get(sum-arr[i]));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
    }
    
}

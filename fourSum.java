
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
public class fourSum {

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
        int target=s.nextInt();
        Arrays.sort(arr);
       fourSum(arr,n,target);
    }

    private static void fourSum(int[] arr, int n, int target) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i=0;i<=n-4;i++){
            if(i!=0&&arr[i]==arr[i-1])continue;
            int tar=target-arr[i];
            List<List<Integer>> ans=threeSum(arr,i+1,tar);
            for(List<Integer> subList:ans){
                subList.add(arr[i]);
                Collections.sort(subRes);
                System.out.println(subList);
            }
        }
    }

    private static List<List<Integer>> threeSum(int[] arr, int si, int target) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<List<Integer>> res=new ArrayList<>();
        int n=arr.length;
        for(int i=si;i<n-2;i++){
            if(i!=0&&arr[i]==arr[i-1])continue;
            int val1=arr[i];
            int tar=target-val1;
             List<List<Integer>> x=twoSum(arr,i+1,n-1,tar);
             for(List<Integer> subRes:x){subRes.add(arr[i]);res.add(subRes);}
    }
    return res;
}

    private static List<List<Integer>> twoSum(int[] arr, int i, int j, int target) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<List<Integer>> ans=new ArrayList<>();
        while(i<j){
            if(i!=0&&arr[i]==arr[i-1]){i++;continue;}
            int sum=arr[i]+arr[j];
            if(sum==target){
                List<Integer> subList=new ArrayList<>();
                subList.add(arr[i]);subList.add(arr[j]);
                ans.add(subList);
                i++;
                j--;
            }else if(sum>target)j--;
            else i++;
        }
        return ans;
    }
}

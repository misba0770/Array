
import java.util.ArrayList;
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
public class kSum {

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
        int k=s.nextInt();
        Arrays.sort(arr);
        
       ArrayList<ArrayList<Integer>> res=ksumHelper(arr,target,k,0);
       for(ArrayList<Integer> ans:res){
           System.out.println(ans);
       }
    }

    private static ArrayList<ArrayList<Integer>> ksumHelper(int[] arr,int target,int k,int si) {
       if(k==2){
            return twoSum(arr,target,si);
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        if(n-k<0)return ans;
        for(int i=si;i<=n-k;i++){
            if(i!=si&&arr[i]==arr[i-1])continue;
            ArrayList<ArrayList<Integer>> subList=ksumHelper(arr,target-arr[i],k-1,i+1);
            for(ArrayList<Integer> x:subList){
                x.add(arr[i]);
                //Collections.sort(x);
                ans.add(x);
            }
        }
        return ans;
    }

    public static ArrayList<ArrayList<Integer>> twoSum(int[] arr,int target,int si){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int left=si;
        int right=arr.length-1;
        while(left<right){
            if(left!=si&&arr[left]==arr[left-1]){
                left++;
                continue;
            }
            int sum=arr[left]+arr[right];
            if(sum==target){
                ArrayList<Integer> x=new ArrayList<>();
                x.add(arr[left]);
                x.add(arr[right]);
                ans.add(x);
                left++;
                right--;
            }
            else if(sum>target)right--;
            else left++;
        }
    
    return ans;
    }
    }
    


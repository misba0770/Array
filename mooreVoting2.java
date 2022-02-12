
import java.util.ArrayList;
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
        ArrayList<Integer> ans=mooreVoting(arr,n);
        for(int a:ans){
            System.out.print(a+" ");
        }
    }

    private static ArrayList<Integer> mooreVoting(int[] arr, int n) {
        int val1=arr[0];
        int count1=1;
        int val2=arr[0];
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==val1)count1++;
            else if(arr[i]==val2)count2++;
            else{
                if(count1==0){
                    count1=1;
                    val1=arr[i];
                }else if(count2==0){
                    count2=1;
                    val2=arr[i];
                }
                else{
                    count1--;
                    count2--;
                }
            }i++;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(isGreaterThan(val1,arr))ans.add(val1);
        if(isGreaterThan(val2,arr))ans.add(val2);
        if(ans.isEmpty())ans.add(-1);
        return ans;
    }

    private static boolean isGreaterThan(int x,int[] arr) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)c++;
        }
        if(c>arr.length/3)return true;
        else return false;
    }
    
}

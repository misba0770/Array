
import java.util.ArrayList;
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
public class findDup {

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
        ArrayList<Integer> ans=findDup(arr,n);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    private static ArrayList<Integer> findDup(int[] arr, int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int index=Math.abs(arr[i]-1);
            if(arr[index]<0)ans.add(index+1);
            else 
                arr[index]*=-1;
        }
        return ans;
    }
    
}


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
public class boatsToSavePeople {

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
        int limit=s.nextInt();
        //given an array arr[i] is the wt of the ith person
        //given an infinite no of boats where each boat can carry max wt of limit
        //each boat can carry atmost 2 people
        //find min no of boats
       Arrays.sort(arr);
       int c=0;
       int left=0;
      int right=n-1;
      while(left<=right){
          int sum=arr[left]+arr[right];
          if(sum<=limit){left++;right--;}
          else
          {right--;}
          c++;
      }
      System.out.print(c);
    }
    
}

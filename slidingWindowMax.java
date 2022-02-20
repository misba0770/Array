
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
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
public class slidingWindowMax {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        int B=s.nextInt();
       int[] res= slidingWindowMax(arr,B);
       for(int x:res){
           System.out.print(x+" ");
       }
    }

    private static int[] slidingWindowMax(int[] arr, int B) {
        int res[]=new int[arr.length-B+1];
      Queue<Integer> q=new LinkedList<Integer>();
      int i=0,j=0;
      int n=arr.length;
      while(j<n){
          if(q.isEmpty())q.add(arr[j]);
          else{
              while(!q.isEmpty()&&q.peek()<arr[j])q.poll();
              q.add(arr[j]);
          }
          if(j-i+1<B)j++;
          else if(j-i+1==B){
              res[i]=q.peek();
              if(arr[i]==q.peek())q.poll();
              i++;
              j++;
          }
      }
            
        return res;
    } 
    
}

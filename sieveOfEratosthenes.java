
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
public class sieveOfEratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=s.nextInt();
//        }
        ArrayList<Integer> ans=solve(n);
        for(Integer x:ans){
            System.out.print(x+" ");
        }
    }

    private static ArrayList<Integer> solve(int N) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         ArrayList<Integer> ans=new ArrayList<>();
        boolean isPrime[]=new boolean[N+1];
        for(int i=0;i<isPrime.length;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<=isPrime.length;i++){
            if(isPrime[i]==true){
            //   for(int j=i+i;j<isPrime.length;j+=i){
            //       isPrime[j]=false;
            int c=i;
            while(c*i<isPrime.length){
                isPrime[c*i]=false;
                c++;
            }
               }
                }
            
        
        for(int i=2;i<=N;i++){
            if(isPrime[i]==true)ans.add(i);
        }
        return ans;
    }
    
}

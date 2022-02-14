
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
public class missingPositive {

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
        int i=0;
        while(i<n){
            if(arr[i]>0&&arr[i]<=n&&arr[i]!=arr[arr[i]-1]){
                int x=arr[i]-1;
               int temp=arr[i];
               arr[i]=arr[x];
               arr[x]=temp;
            }else i++;
        }int ans=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){ans=j+1;break;}
            
        }
        if(ans==0)ans=n+1;
        System.out.print(ans);
    }
    
}

public class Solution {
    public int[] addArrays(int[] A, int[] B) {

        
       int n=A.length>B.length?A.length:B.length;
     
        int ans[]=new int[n];
        int c=n-1;
        int carry=0;
        int l=A.length-1;
        int m=B.length-1;
        while(c>=0){
          int temp=carry;
           if(l>=0)temp+=A[l];
           if(m>=0)temp+=B[m];
           
        carry=temp/10;
            ans[c--]=(temp%10);
            l--;
            m--;
          }
          if(carry!=0){
              int sol[]=new int[n+1];
              sol[0]=carry;
              int k=1;
              for(int i=0;i<sol.length-1;i++){
                  sol[i+1]=ans[i];
              }
              return sol;
          }
                  
         
        
         
          return ans;
    }
}

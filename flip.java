public class Solution {
    public int[] flip(String A) {
        int ans1=-1;
        int ans2=-1;int max=Integer.MIN_VALUE;int st=0;int c=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='0')c++;
            else c--;
            if(c>=0){
                 if(c>max){
                     max=c;
                     ans1=st;
                     ans2=i;
                 }
            }
            else{
                c=0;
                st=i+1;
            }
        }
        int ans[]=new int[2];int x=-1;
        if(ans1==-1)return new int[0];
        
        ans[++x]=ans1+1;
        ans[++x]=ans2+1;
      
        return ans;
      
    }
}

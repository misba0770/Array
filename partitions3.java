public class Solution {
    public int solve(int A, int[] B) {
        int sum=0;
        for(int i:B)sum+=i;
        if(sum%3!=0)return 0;
        int oneThird=sum/3;
        int suffix[]=new int[A];
        int temp=0;
        for(int i=A-1;i>=0;i--){
          temp+=B[i];
          if(temp==oneThird){
              suffix[i]=1;
          }
        }
        int s=0;
        int c=0;
        for(int i=0;i<A-1;i++){
            s+=B[i];
            if(s==oneThird){
                for(int j=i+2;j<A;j++){
                    if(suffix[j]==1)c++;
                }
            }
        }
        return c;
    }
}

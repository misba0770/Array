public class Solution {
    public int firstMissingPositive(int[] A) {
        boolean isOnePresent=false;
        int n=A.length;
        for(int i=0;i<n;i++){
            if(A[i]==1)isOnePresent=true;
            if(A[i]<1||A[i]>n)A[i]=1;
        }
        if(!isOnePresent)return 1;
        for(int i=0;i<n;i++){
            int idx=Math.abs(A[i]);
            A[idx-1]=-Math.abs(A[idx-1]);
        }
        for(int i=0;i<n;i++){
            if(A[i]>0)return i+1;
        }
        return n+1;
    }
}

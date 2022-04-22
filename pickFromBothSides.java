public class Solution {
    public int solve(int[] A, int B) {
        int sum=0;
        int max=0;
        for(int i=0;i<B;i++)sum+=A[i];
        max=sum;
        int j=1;
        int n=A.length;
        for(int i=B-1;i>=0;i--){
            sum=sum+A[n-j]-A[i];
            j++;
            max=Math.max(max,sum);
        }
        return max;
    }
}

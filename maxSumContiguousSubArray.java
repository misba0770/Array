public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int sum=0;int n=A.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
             sum=Math.max(A[i],sum+A[i]);
             if(sum>max)max=sum;
        }return max;
    }
}

//i<j<k
//A[i]<A[j]<A[k]
public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        int rightMax[]=new int[n];
        rightMax[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],A[i]);
        }
        TreeSet<Integer> set=new TreeSet<>();
        set.add(A[0]);
        int sum=Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++){
           Integer lmax=set.lower(A[i]);
           int right=rightMax[i];
           if(right>A[i]&&lmax!=null)sum=Math.max(sum,lmax+right+A[i]);
           set.add(A[i]);
        }
        if(sum>Integer.MIN_VALUE)return sum;
        return 0;
    }
}

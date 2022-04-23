//https://www.interviewbit.com/problems/minimum-lights-to-activate/
public class Solution {
    public int solve(int[] A, int B) {
        int i=0;
        int c=0;
        int n=A.length;
        while(i<n){
            int left=Math.max(i-B+1,0);
            int right=Math.min(i+B-1,n-1);
            boolean flag=false;
            while(right>=left){
                if(A[right]==1){
                    flag=true;
                    break;
                }right--;
            }
            if(flag==false)return -1;
            c++;
            i=right+B;
        }
        return c;
    }
}

public class Solution {
    public int[] subUnsort(int[] A) {
          int n = A.length;
        int[] rmin = new int[A.length];
        int[] lmax = new int[A.length];

        rmin[n - 1] = A[n-1];
        lmax[0] = A[0];

        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i-1], A[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rmin[i] = Math.min(rmin[i + 1], A[i]);
        }

        int start = 0;
        int end = n - 1;

        while (start < n && rmin[start] == A[start]) {
            start++;
        }
if (start == n) {
            return new int[]{-1};
        }
        while (end > 0 && lmax[end] == A[end]) {
            end--;
        }

       
            return new int[] {start, end};
        
        

    }
}

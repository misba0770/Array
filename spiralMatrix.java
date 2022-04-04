public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
       
       int top=0;
       int down=A.length-1;
       int left=0;
       int right=A[0].length-1;
       int dir=0;int ans[]=new int[(down+1)*(right+1)];int c=-1;
       while(top<=down&&left<=right){
           if(dir==0){
               for(int i=left;i<=right;i++){
                   ans[++c]=A[top][i];
               }
               top++;
           }
           else if(dir==1){
               for(int i=top;i<=down;i++){
                   ans[++c]=A[i][right];
               }
               right--;
           }
           else if(dir==2){
               for(int i=right;i>=left;i--){
                   ans[++c]=A[down][i];
               }
               down--;
           }
           else if(dir==3){
               for(int i=down;i>=top;i--){
                   ans[++c]=A[i][left];
               }
               left++;
           }
           dir=(dir+1)%4;
           
       }return ans;
       
       
       
    }
}

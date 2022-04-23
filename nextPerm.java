public class Solution {
    public int[] nextPermutation(int[] A) {
           int n=A.length;
        if(n==1)
        return A;


        int firstdip=-1,nextGreat=0;
        for(int i=n-2;i>=0;i--){
                if(A[i]<A[i+1])
                { firstdip=i;break;}
        }
        if(firstdip==-1){ //this is where i fkd up coz i didnt know sorted order return karna if not possible 
                            //coz im dumb at reading questions
             Arrays.sort(A);
             return A;
             }

           for(int i=n-1;i>firstdip;i--){
                if(A[firstdip]<A[i])
                {
                     
                     nextGreat=i;
                    break;}
            }
            int t=A[firstdip];
            A[firstdip]=A[nextGreat];
            A[nextGreat]=t;
        
        int j=A.length-1;
        for(int i=firstdip+1;i<j;i++,j--){
                 int a=A[i];
            A[i]=A[j];
            A[j]=a;
            } 
            return A;
    }
}

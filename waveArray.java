public class Solution {
    public int[] wave(int[] A) {
     Arrays.sort(A);
        for(int i=0;i<A.length-1;i++){
            if(i%2==0){
                if(A[i+1]>A[i])swap(A,i,i+1);

            }
            else{
            if(A[i+1]<A[i])swap(A,i,i+1);
            }
        }

    return A;
    }
     public void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        return;
    }
}

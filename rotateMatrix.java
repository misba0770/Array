public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
        int m=a.size();
       // int n=a.get(0).size();
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
               Integer swap=a.get(i).get(j);
               a.get(i).set(j,a.get(j).get(i));
               a.get(j).set(i,swap);
            }
        }
        for(int i=0;i<m;i++){
            Collections.reverse(a.get(i));
        }
        return;
	}
}

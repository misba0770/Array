public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
     ArrayList<Interval> ans=new ArrayList<>();
     boolean flag=false;
     int start=newInterval.start;
     int end=newInterval.end;
     for(Interval i:intervals){
         if(i.end<start){
             ans.add(i);
         }
         else if(i.start>end){
         if(flag==false)ans.add(new Interval(start,end));
         flag=true;
         ans.add(i);
         }
         else{
             start=Math.min(start,i.start);
             end=Math.max(end,i.end);
         }
     }
     if(flag==false){
         ans.add(new Interval(start,end));
     }
     return ans;
    }
}

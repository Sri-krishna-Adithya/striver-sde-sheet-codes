import java.util.*;
class Solution {
    public int[] twoSum(int[] arr, int target) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       int[] res=new int[2];
       for(int i=0;i<arr.length;i++){
        int diff=target-arr[i];
        if(hm.containsKey(diff)){
            res[0]=i;
            res[1]=hm.get(diff);
            return res;
        }
        else{
            hm.put(arr[i],i);
        }
       }
       return res;
    }
}
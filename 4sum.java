import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long target1 = (long) target - nums[i] - nums[j];
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int k = j + 1; k < nums.length; k++) {
                    long req = target1 - nums[k];

                    if (req >= Integer.MIN_VALUE &&
                        req <= Integer.MAX_VALUE &&
                        map.containsKey((int) req)) {

                        List<Integer> quad = new ArrayList<>(
                                Arrays.asList( nums[i], nums[j],nums[k],(int) req));
                        Collections.sort(quad);
                        set.add(quad);
                    }
                    map.put(nums[k], k);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
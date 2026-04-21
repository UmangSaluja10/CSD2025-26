import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        
        int minDist = Integer.MAX_VALUE;
        
        for (List<Integer> list : map.values()) {
            int size = list.size();
            
            if (size >= 3) {
                for (int i = 0; i <= size - 3; i++) {
                    int first = list.get(i);
                    int third = list.get(i + 2);
                    
                    int dist = 2 * (third - first);
                    minDist = Math.min(minDist, dist);
                }
            }
        }
        
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}

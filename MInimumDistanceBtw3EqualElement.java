import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        int minDist = Integer.MAX_VALUE;
        for (List<Integer> indices : map.values()) {
            int size = indices.size();
            
            if (size < 3) continue;
            for (int i = 0; i <= size - 3; i++) {
                int first = indices.get(i);
                int third = indices.get(i + 2);
                int dist = 2 * (third - first);
                minDist = Math.min(minDist, dist);
            }
        }
        
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int left,right;
        List<List<Integer>> resList = new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
                left = j+1;
                right = n-1;
                while(left<right){
                    long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        resList.add(list);
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1])left++;
                        while(left<right && nums[right]==nums[right+1])right--;
                    }else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return resList;
    }
}

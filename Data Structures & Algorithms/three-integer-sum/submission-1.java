class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int anchor = 0; anchor < n - 2; anchor++) {
            if(nums[anchor] > 0) {
                break;
            }
            if(anchor > 0 && nums[anchor] == nums[anchor - 1]) {
                continue;
            }
            int left = anchor + 1, right = n - 1;

            while(left < right) {
                int sum = nums[anchor] + nums[left] + nums[right];

                if(sum > 0) {
                    right--;
                } else if(sum < 0) {
                    left++;
                } else if(sum == 0) {
                    res.add(Arrays.asList(nums[anchor], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;

                }

            }

        }
        return res;
        
    }
}

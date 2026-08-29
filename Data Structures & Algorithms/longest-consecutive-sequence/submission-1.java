class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int longestSequence = 1;

        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for(int i : set) {
            int currentNum = i;
            int prevSequenceNumber = currentNum - 1;
            int count = 1;
            if(set.contains(prevSequenceNumber)) {
                continue;
            }
            while(set.contains(currentNum + 1)) {
                currentNum += 1;
                count += 1;
            }
           longestSequence = Math.max(longestSequence, count);
        }
        return longestSequence;

    }
}

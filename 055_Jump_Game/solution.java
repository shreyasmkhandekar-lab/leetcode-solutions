class Solution {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            if (currentIndex > maxReachable) {
                return false;
            }

            maxReachable = Math.max(maxReachable, (currentIndex + nums[currentIndex]));

        }
        return true;
    }
}
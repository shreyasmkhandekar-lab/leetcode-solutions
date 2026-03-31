class Solution {
    public int removeDuplicates(int[] nums) {
        int uniq = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniq]) {
                uniq++;
                nums[uniq] = nums[i];
            }
        }
        return uniq + 1;
    }
}
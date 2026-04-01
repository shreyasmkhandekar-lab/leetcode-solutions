class Solution {
    public int removeElement(int[] nums, int val) {

        int validElementIndex = 0;

        for (int currentNum : nums) {
            if (currentNum != val) {
                nums[validElementIndex] = currentNum;
                validElementIndex++;
            }
        }
        return validElementIndex;
    }
}
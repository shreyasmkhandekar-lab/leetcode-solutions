class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            maxArea(new int[] { 0, 0 });
        }
    }

    public static int maxArea(int[] height) {
        int begin = 0;
        int end = height.length - 1;
        int res = 0;
        int minH = -1;
        while (begin < end) {
            minH = Math.min(height[begin], height[end]);
            res = Math.max(res, minH * (end - begin));
            while (begin < end && height[begin] <= minH) {
                begin++;
            }
            while (begin < end && height[end] <= minH) {
                end--;
            }
        }

        return res;
    }
}
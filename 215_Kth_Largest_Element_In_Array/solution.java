import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>();
        for (int num : nums) {
            maxHeap.offer(num);
            while (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
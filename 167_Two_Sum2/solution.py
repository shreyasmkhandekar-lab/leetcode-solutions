class Solution:   
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left = 0
        right = len(numbers) - 1 
        res = numbers[left] + numbers[right]

        while res != target: 
            if res > target:
                right -= 1
            elif res < target:
                left += 1
            res = numbers[left] + numbers[right]
        return [left + 1, right + 1]
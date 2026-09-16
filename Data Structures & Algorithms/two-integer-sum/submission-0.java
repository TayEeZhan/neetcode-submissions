class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    int answer[] = new int[]{i,j};
                    return answer;
                }
            }
        }
        return null;
    }

}

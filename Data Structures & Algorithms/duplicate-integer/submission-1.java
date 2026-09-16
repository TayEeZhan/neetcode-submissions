class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];

            if (seen.contains(number)) {
                return true;
            }

            seen.add(number);
        }

        return false;
    }
}

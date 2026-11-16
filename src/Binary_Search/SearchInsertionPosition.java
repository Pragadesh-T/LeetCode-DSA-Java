class SearchInsertionPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int result = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target <= nums[mid]) {
                result = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return result;
    }
}
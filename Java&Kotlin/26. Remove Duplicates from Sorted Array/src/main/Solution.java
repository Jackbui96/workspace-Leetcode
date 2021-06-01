package main;

public class Solution {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int p = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[p]) {
                nums[p + 1] = nums[i];
                p++;
            }
        }
        return ++p;
    }

}



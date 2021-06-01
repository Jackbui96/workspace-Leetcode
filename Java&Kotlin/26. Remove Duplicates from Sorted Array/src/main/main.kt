package main

fun removeDuplicates(nums: IntArray): Int {

    if (nums.isEmpty()) return 0
    if (nums.size == 1) return 1

    var p = 0
    for (i in 1 until nums.size) {
        if (nums[i] != nums[p]) {
            nums[p + 1] = nums[i]
            p++
        }
    }

    return ++p
}
package com.revision;

public class PeakElementFinder {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[mid + 1]) {
                // If mid element is greater than the next element, move the right pointer to mid
                right = mid;
            } else {
                // If mid element is less than or equal to the next element, move the left pointer to mid + 1
                left = mid + 1;
            }
        }
        
        // Left and right will converge to the peak element
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element index: " + peakIndex);
        // Output: Peak element index: 2 (nums[2] is 3, which is a peak)
    }
}

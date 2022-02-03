package com.company;

public class RotateBinarySearch {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 0, 1, 2, 3, 4, 5};
        System.out.println(search(arr,4));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //case1
        if (pivot == -1) {
            //normal binary search
            binarysearch(nums, target, 0, nums.length - 1);
        }
        //case 2
        if (nums[pivot] == target) {
            return pivot;
        }
        //case 3
        if (target > nums[pivot]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }
        //case 4

        return binarysearch(nums, target, pivot + 1, nums.length - 1);

    }

    static int binarysearch(int nums[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }return -1;
    }
    static int findPivot(int []array){
            int s=0;
            int e=array.length-1;
            while (s <= e) {
            int mid = (s + e) / 2;
            //case 1
            if (mid < e && array[mid] > array[mid + 1]) {
                return mid;
            }
            //case 2
            if (mid > s && array[mid] < array[mid - 1]) {
                return mid = mid - 1;
            }
            //case 3
            if (array[mid] < array[s]) {
                e = mid - 1;
            }
            //case 4
            else {
                s = mid + 1;
            }

        }
        return -1;
    }

}


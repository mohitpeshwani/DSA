package com.company;

import java.util.Arrays;

public class Find1standlastOccurence {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,5,6,7};
        int target=4;
        System.out.println(Arrays.toString(occurences(arr,target)));

    }
    static int[] occurences(int[] nums,int target) {
    int ans[]={-1,-1};
    ans[0]=first(nums,target,true);
    ans[1]=first(nums,target,false);
    return ans;
    }

        static int first(int[] nums,int target,boolean response){
            int start=0,end=nums.length-1;
            int ans=-1;
            while(start<=end){
                int mid=(start+end)/2;
                if(target<nums[mid]){
                    end=mid-1;
                }
                else if(target>nums[mid]){
                    start=mid+1;
                }

                if(nums[mid]==target){
                    ans=mid;
                    if(response){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            } return ans;
        }
    }



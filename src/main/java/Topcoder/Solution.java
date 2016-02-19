package Topcoder;
/*
 * Given an array of integers, find if the array contains any duplicates.
 *  Your function should return true if any
 * value appears at least twice in the array, and it should return false if every element is distinct.
 * */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <=1) return false;
        int max = nums[0];
        int min =nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]) max=nums[i];
            if(min>nums[i]) min=nums[i];
        }
        int[] arr = new int[max-min+1];
       for(int i=0;i<nums.length;i++){
           if(arr[nums[i]-min]==0){
               arr[nums[i]-min]++;
           }else{
               return true;
           }
       }
       return false;
    }
}



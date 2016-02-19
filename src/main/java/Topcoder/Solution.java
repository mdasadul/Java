package Topcoder;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int a=0;
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



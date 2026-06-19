import java.util.Arrays ;
class Solution {
    public int singleNumber(int[] nums) {
            int ans = 0;
            Arrays.sort(nums) ;
            if(nums.length==1)
            ans=nums[0];
            for(int i=0; i<nums.length-1; i=i+2)
            {
                if(nums[i]!=nums[i+1] &&  i+1<=nums.length-1)
                {ans=nums[i]; 
                break ;}
                else
                {ans=nums[nums.length-1] ;}
            }
      

        return ans;
    }
}
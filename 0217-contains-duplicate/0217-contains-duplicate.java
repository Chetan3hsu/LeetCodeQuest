import java.util.Hashtable;
class Solution {
    public boolean containsDuplicate(int[] nums) {
          HashSet<Integer> no = new HashSet<>();
         for(int i=0; i<nums.length; i++)
         { if(no.contains(nums[i]))
           return true;
           no.add( nums[i]) ;
         }
         return false;
    }
}
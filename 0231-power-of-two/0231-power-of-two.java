class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n<1)
      return false ;
      if(1073741824%n==0)
      return true;
      return false;
    }
}
class Solution {
    public int hammingWeight(int n) {
int count=0;
        while(n!=0)
        {
         int bit= n%2 ;
         int d=n/2 ;
         if(bit==1)
         count++ ;
         n=d ;
         }
         return count ;
    }
    
}
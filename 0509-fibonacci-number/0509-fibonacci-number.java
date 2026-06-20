class Solution {
    public int fib(int n) {
        int f=0; 
        int t=1;
        int s=1 ;
        if(n==0||n==1)
           return n ;
          for(int i=2; i<=n ; i++)
          {
            t=f+s;
            f=s;
            s=t;
          }  
        return t;
        

    }
}
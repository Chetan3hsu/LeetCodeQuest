class Solution {
    public boolean isPalindrome(int x) {
        String rev="";
        boolean tt=false;
         String copy=String.valueOf(x) ; 
        int l=copy.length();
       for(int i=l-1 ; i>=0; i--)
        rev=rev+ copy.charAt(i) ;
        if(rev.equals((String.valueOf(x))))
        tt= true;
      return tt;
    }
}
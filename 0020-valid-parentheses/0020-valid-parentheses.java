class Solution {
    public boolean isValid(String s) {
       Deque <Character> paran = new ArrayDeque<>() ;
      for(int i=0; i<s.length(); i++)
      {
       char start=s.charAt(i) ;
       if(start=='{'||start=='['||start=='(')
       paran.push(start) ;
       else
       {
        if(paran.isEmpty())
        return false  ;
       char end=paran.pop();
        if(start==')'&& end!='(' 
        ||start=='}'&& end!='{' ||
         start==']'&& end!='[')
          return false;
       }
      }
     return paran.isEmpty(); 
    }
}
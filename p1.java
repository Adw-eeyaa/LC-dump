class Solution {
    public String longestPalindrome(String s) {
        //String rev ="";
        char[] ans;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String str = sb.toString();
        //for(int i = s.length() - 1;i >= 0;i--){
            //rev = rev + s.charAt(i);

        
        for(int i = 0;i < s.length();i++){
           if(s.charAt(i) == str.charAt(i)){
              ans = new char[]{str.charAt(i)};
              String str1 = ans.toString();
              //ArrayList<Character> an = new ArrayList();
              //for(int j = 0;j < an.size();j++){
                //an.add(rev.charAt(i));
                //String str = new String(Character.toString(an));
              }
              
           
           }
           
           return str1;
           
    }
    
}

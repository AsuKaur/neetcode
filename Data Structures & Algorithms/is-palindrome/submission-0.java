class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for (char i:s.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                str.append(Character.toLowerCase(i));
            }
        }
        return str.toString().equals(str.reverse().toString());
    }
}

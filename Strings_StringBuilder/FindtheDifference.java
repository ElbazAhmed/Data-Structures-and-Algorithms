package Strings_StringBuilder;

public class FindtheDifference {
    //https://leetcode.com/problems/find-the-difference/
    //You are given two strings s and t.
    //String t is generated by random shuffling string s and then add one more letter at a random position.
    //Return the letter that was added to t.
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));
    }

    static char findTheDifference(String s, String t) {
        int diff=0;
        for(int i=0; i<t.length(); i++){
            diff+=t.charAt(i);
            if(i<s.length()){
                diff-=s.charAt(i);
            }
        };
        //the difference between the sums of ASCII values represents the ASCII value of the additional character in t
        return (char)diff;
    }

}
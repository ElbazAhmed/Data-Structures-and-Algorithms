package Strings_StringBuilder;

import java.util.HashMap;

public class CustomSortString {
    public static void main(String[] args) {
        String order = "cba", s = "abcd";
        System.out.println(customSortString(order,s));
    }

    static String customSortString(String order, String s) {
        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
        char[] charArray = order.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
            }else{
                hash.put(s.charAt(i),1);
            }
        }
        for(int i=0; i<order.length(); i++){
            if(hash.containsKey(charArray[i])){
                for(int j=0; j<hash.get(charArray[i]);j++){
                    str.append(charArray[i]);
                }
                hash.remove(charArray[i]);
            }
        }
        for(char c : hash.keySet()){
            for(int i=0; i<hash.get(c); i++){
                str.append(c);
            }
        }

        return str.toString();

    }
}

package LinearSearchAlgoritm;


import java.util.Arrays;

public class LinearSearchStrings {

    static boolean SearchInString (String str, char target){

        if(str.isEmpty()){
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if(target == str.charAt(index)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "ahmed";
        char target = 'm';
        System.out.println(SearchInString(str, target));
    }
}

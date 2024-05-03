package Strings_StringBuilder;

public class CompareVersionNumbers {
    // https://leetcode.com/problems/compare-version-numbers/
    // Given two version numbers, version1 and version2, compare them.
    // Return the following:
    //    If version1 < version2, return -1.
    //    If version1 > version2, return 1.
    //    Otherwise, return 0.
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int len1 = ver1.length;
        int len2 = ver2.length;
        int max = Math.max(len1,len2);
        for(int i = 0; i < max; i++){
            int val1 = i >= len1 ? 0 : Integer.parseInt(ver1[i]);
            int val2 = i >= len2 ? 0 : Integer.parseInt(ver2[i]);
            if(val1 < val2){
                return -1;
            }else if(val1 > val2){
                return 1;
            }
        }
        return 0;
    }
}

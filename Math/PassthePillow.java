package Math;

public class PassthePillow {
    // https://leetcode.com/problems/pass-the-pillow/
    // There are n people standing in a line labeled from 1 to n. The first person in the line is holding a pillow initially.
    // Every second, the person holding the pillow passes it to the next person standing in the line. Once the pillow reaches the end of the line,
    // the direction changes, and people continue passing the pillow in the opposite direction.
    //    For example, once the pillow reaches the nth person they pass it to the n - 1th person, then to the n - 2th person and so on.
    //Given the two positive integers n and time, return the index of the person holding the pillow after time seconds.

    public int passThePillow(int n, int time) {
        if((time/(n-1))%2 != 0){
            return n-(time%(n-1));
        }else{
            return 1+(time%(n-1));
        }
    }
}

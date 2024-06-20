package BinarySearchAlgorithm;
import java.util.Arrays;
public class MagneticForceBetweenTwoBalls {
    // https://leetcode.com/problems/magnetic-force-between-two-balls/
    // In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has n empty baskets, the ith basket is at position[i],
    // Morty has m balls and needs to distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.
    //Rick stated that magnetic force between two different balls at positions x and y is |x - y|.
    //Given the integer array position and the integer m. Return the required force.
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int l =1;
        int h = position[n-1]-position[0];
        int res = -1;

        while(l <= h){

            int mid = l + (h-l)/2;
            int dist = calculate(position, mid);

            if(dist >= m){
                res = mid;
                l = mid+1;
            }
            else
                h = mid-1;
        }
        return res;
    }


    public int calculate(int[] arr, int mid){
        int ball = 1;
        int pos = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]-pos >= mid){
                ball++;

                pos = arr[i];
            }
        }
        return ball;
    }
}

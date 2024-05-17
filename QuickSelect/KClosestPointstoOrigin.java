package QuickSelect;

public class KClosestPointstoOrigin {
    // https://leetcode.com/problems/k-closest-points-to-origin/
    // Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k,
    // return the k closest points to the origin (0, 0).
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        kClosest(points,k-1,0, points.length-1);
        for (int i = 0; i < k; i++) {
            result[i] = points[i];
        }
        return result;
    }
    public void kClosest(int[][] points, int k, int first, int last){
        if (first >= last) {
            return;
        }
        int start = first;
        int end = last;
        int p = start + (end - start)/2;
        double pivot = distancetoOrigin(points[p]);
        while(start < end){
            while(distancetoOrigin(points[start]) < pivot){
                start++;
            }
            while(distancetoOrigin(points[end]) > pivot){
                end--;
            }
            if(start <= end){
                swap(points,start,end);
                start++;
                end--;
            }
        }
        kClosest(points,k,first,end);
        kClosest(points,k,start,last);
    }
    public double distancetoOrigin(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
    public void swap(int[][] points, int i, int j){
        int[] temp = points[i];
        points[i] = points[j];
        points[j] = temp;
    }
}

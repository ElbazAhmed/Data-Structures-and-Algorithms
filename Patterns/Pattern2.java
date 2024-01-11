package Patterns;

public class Pattern2 {
    //        * * * * *
    //        * * * *
    //        * * *
    //        * *
    //        *
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2(int n){
        for (int row = 0; row < n ; row++) {
            //for every row we print col n-row time
            for (int col = 0; col < n-row ; col++) {
                System.out.print("* ");
            }
            //for every row we print we need a new line
            System.out.println();
        }
    }
}

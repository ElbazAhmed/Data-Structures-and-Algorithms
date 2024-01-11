package Patterns;

public class Pattern1 {
     //    *
     //    * *
     //    * * *
     //    * * * *
     //    * * * * *
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            //for every row we print col row time
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            //for every row we print we need a new line
            System.out.println();
        }
    }
}

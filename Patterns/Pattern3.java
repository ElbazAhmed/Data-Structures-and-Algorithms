package Patterns;

public class Pattern3 {
    //        *
    //        * *
    //        * * *
    //        * * * *
    //        * * * * *
    //        * * * *
    //        * * *
    //        * *
    //        *
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n){
        for (int row = 1; row < n*2; row++) {
            //at every step we print row number of columns
            int colNumber = row;
            //if the row number exced n the number of colums should be decreased at every step by 1
            if(row>n){
                colNumber = n*2-row;
            }
            for (int col = 1; col <= colNumber; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

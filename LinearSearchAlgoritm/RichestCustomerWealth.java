package LinearSearchAlgoritm;

public class RichestCustomerWealth {
    //You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
    // the ith customer has in the jth bank. Return the wealth that the richest customer has.

    public static void main(String[] args) {
        int[][] accounts = {{1,9,5}, {7,1,3}, {2,8,7}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
    int maxWealth = 0;
        // person = index
        // accounts = index1
        for (int index = 0; index < accounts.length; index++) {
            int count =0;
            for (int index1 = 0; index1 < accounts[index].length; index1++) {
                count+=accounts[index][index1];
            }
            if(maxWealth < count ){
                maxWealth = count;
                count=0;
            }
        }
        return maxWealth;
    }
}

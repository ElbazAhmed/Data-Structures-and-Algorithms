package Math;

public class WaterBottles {
    // https://leetcode.com/problems/water-bottles/
    // There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.
    //The operation of drinking a full water bottle turns it into an empty bottle.
    //Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

    public int numWaterBottles(int numBottles, int numExchange) {
        int total = 0;
        int emptyBottles = 0;
        while(numBottles > 0){
            total += numBottles;
            emptyBottles += numBottles;
            numBottles = emptyBottles/numExchange;
            emptyBottles -= numBottles*numExchange;
        }
        return total;
    }
}

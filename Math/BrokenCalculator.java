package Math;

public class BrokenCalculator {
    // https://leetcode.com/problems/broken-calculator/
    // There is a broken calculator that has the integer startValue on its display initially. In one operation, you can:
    //    multiply the number on display by 2, or
    //    subtract 1 from the number on display.
    //Given two integers startValue and target, return the minimum number of operations needed to display target on the calculator.

    public int brokenCalc(int startValue, int target) {
        int count = 0;
        while(target > startValue){
            if(target%2 == 0){
                target /= 2;
            }else{
                target +=1;
            }
            count++;
        }

        return count + startValue - target;
    }
}

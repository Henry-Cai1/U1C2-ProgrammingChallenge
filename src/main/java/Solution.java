public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4)/4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) (average + 0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int totalAmount = (int) Math.round(userDouble * 100);
        int d5 = (totalAmount % 10 + 1) % 10;
        int d4 = ((totalAmount / 10) % 10 + 1) % 10;
        int d3 = ((totalAmount / 100) % 10 + 1) % 10;
        int d2 = ((totalAmount / 1000) % 10 + 1) % 10;
        int d1 = ((totalAmount / 10000) % 10 + 1) % 10;
        int newAmount = (d1 * 10000) + (d2 * 1000) + (d3 * 100) + (d4 * 10) + d5;
        return newAmount / 100.0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(657.39));
    }

}

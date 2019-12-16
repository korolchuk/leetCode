class Solution {
    public int mySqrt(int x) {
        
        if (x == 0) {
            return 0;
        }
        
        double t;
	    double squareRoot = (double)x / 2;
 
        do {
            t = squareRoot;
            squareRoot = (t + (x / t)) / 2;
        } while ((t - squareRoot) != 0);

        return (int)squareRoot;
    }
}
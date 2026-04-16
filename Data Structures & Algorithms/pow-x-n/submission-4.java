class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;

        if (Math.abs(n) == 1) {
            if(n < 0) return 1/x;
            return x;
        }
        if (n % 2 != 0) {
            double v = myPow(x, n/ 2);
            if(n<0) return v*v*1/x;
            return v * v * x;
        }
        double v = myPow(x, n / 2);
        return v * v;
    }
}

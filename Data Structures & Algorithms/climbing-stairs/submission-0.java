class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return n;
        int i = 1;
        int j = 1;
        for (int k = 0; k < n - 1; k++) {
            int temp = j;
            j = j + i;
            i = temp;
        }

        return j;
    }
}

class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int l=0;
        int r=x;
        while(l<=r){
            int mid = (l+r)/2;
            long square = (long) mid * mid;
            if (square == x) return mid;
            else if (square < x) l=mid+1;
            else r=mid-1;
        }
        return r;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.mySqrt(2147395599
);
        System.out.println(ans);
    }
}
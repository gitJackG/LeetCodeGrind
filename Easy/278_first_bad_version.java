/* The isBadVersion API is defined in the parent class VersionControl.
   boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0;
        int r = n;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (isBadVersion(m)) r = m - 1;
            else l = m + 1;
        }

        return l;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstBadVersion(5));
    }
}

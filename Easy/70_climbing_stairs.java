import java.util.HashMap;
import java.util.Map;

class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        if (n == 0 || n == 1) return 1;
        map.put(0,1);
        map.put(1,1);
        for (int i = 2; i <= n; i++){
            map.put(i, map.get(i-1)+map.get(i-2));
        }
        return map.get(n);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.climbStairs(7);
        System.out.println(ans);
    }
}
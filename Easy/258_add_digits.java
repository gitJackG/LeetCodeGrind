class Solution {
  public int addDigits(int num) {
    if (num == 0) return 0;
    else if (num % 9 == 0) return 9;
    else return num%9; 
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int ans = solution.addDigits(38);
    System.out.println(ans);
  }
}

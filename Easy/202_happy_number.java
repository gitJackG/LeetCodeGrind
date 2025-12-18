class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)){
            set.add(n);
            int aux = n;
            int sum = 0;
            while (aux > 0){
                sum += Math.pow(aux%10,2);
                aux /= 10;
            }
            if (sum == 1) return true;
            n = sum;
        }
        return false;
    }
}
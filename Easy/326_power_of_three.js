/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function(n) {
  if (n <= 0) return false;
  if (n == 1) return true;
  while (n > 3){
    n /= 3;
  }
  // return 1162261467 % n === 0;
  return n === 3;
};

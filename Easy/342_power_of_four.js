/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfFour = function(n) {
  return !(n & (n - 1)) & n % 3 === 1;
};

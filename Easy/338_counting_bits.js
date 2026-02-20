/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
  var ans = [];
  ans[0] = 0;
  var power = 1;
  for(let i = 1; i <= n; i++){
    if ( power * 2 === i) power = i;
    ans[i] = ans[i - power] + 1;
  }
  return ans;
};

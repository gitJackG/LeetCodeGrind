/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
  var l = 0;
  var r = s.length - 1;

  const vowels = new Set(['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']);
  const arr = s.split(''); 

  while (l < r) {
    while (l < r && !vowels.has(arr[l])) l++;
    while (l < r && !vowels.has(arr[r])) r--;

    if (l < r) {
      [arr[l], arr[r]] = [arr[r], arr[l]]; // swap
      l++;
      r--;
    }
  }

  return arr.join('');
};

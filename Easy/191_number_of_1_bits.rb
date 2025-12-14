# @param {Integer} n
# @return {Integer}
def hamming_weight(n)
    count = 0
    while n > 0 do
        count += 1 if n%2 == 1
        n /= 2
    end
    count
end
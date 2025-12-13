# @param {Integer} n
# @return {Integer}
def reverse_bits(n)
    result = 0;
    for i in 1..32
        result = (result << 1) | (n & 1)
        n >>= 1
    end
    result
end
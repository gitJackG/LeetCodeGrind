# @param {Integer[]} nums
# @return {Integer}
def single_number(nums)
    xor_result = 0
    nums.each do |n|
        xor_result ^= n
    end
    xor_result
end
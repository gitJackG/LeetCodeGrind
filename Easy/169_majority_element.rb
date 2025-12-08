# @param {Integer[]} nums
# @return {Integer}
def majority_element(nums)
  majority = nil
  count = 0
  nums.each do |n|
    if count == 0 then majority, count = n, 1
    elsif n == majority then count += 1
    else count -= 1
    end
  end
  majority
end

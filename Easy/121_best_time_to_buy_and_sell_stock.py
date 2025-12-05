class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = prices[0]
        diff = 0
        for p in prices[1:]:
            if maxP > p:
                maxP = p
            diff = max(diff, p-maxP)
        return diff
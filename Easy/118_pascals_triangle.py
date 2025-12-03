class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = []

        for r in range(numRows):
            if r == 0:
                ans.append([1])
            else:
                prev = ans[-1]
                row = [1]
                for i in range(1, len(prev)):
                    row.append(prev[i-1] + prev[i])
                row.append(1)
                ans.append(row)

        return ans
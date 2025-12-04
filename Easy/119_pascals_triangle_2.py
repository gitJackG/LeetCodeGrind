class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        ans = []
        row = []
        ans.append([1])
        if (rowIndex == 0):
             return [1]
        for r in range(1,rowIndex+1):
                prev = ans[-1]
                row = [1]
                for i in range(1, len(prev)):
                    row.append(prev[i-1] + prev[i])
                row.append(1)
                ans.append(row)

        return row
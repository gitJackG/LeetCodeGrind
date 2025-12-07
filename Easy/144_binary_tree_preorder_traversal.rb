# Definition for a binary tree node.
# class TreeNode
#     attr_accessor :val, :left, :right
#     def initialize(val = 0, left = nil, right = nil)
#         @val = val
#         @left = left
#         @right = right
#     end
# end
# @param {TreeNode} root
# @return {Integer[]}
def preorder_traversal(root)
    list=[]
    helper(list,root)
    list
end

def helper(list,root)
    return unless root
    list.push(root.val)
    helper(list,root.left)
    helper(list,root.right)
end
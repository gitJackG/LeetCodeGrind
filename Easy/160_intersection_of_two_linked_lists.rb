# Definition for singly-linked list.
# class ListNode
#     attr_accessor :val, :next
#     def initialize(val)
#         @val = val
#         @next = nil
#     end
# end

# @param {ListNode} headA
# @param {ListNode} headB
# @return {ListNode}
def getIntersectionNode(headA, headB)
    tempA=headA
    tempB=headB
    while tempA!=tempB
        tempA = tempA.nil? ? headB : tempA.next
        tempB = tempB.nil? ? headA : tempB.next
    end
    tempA
end
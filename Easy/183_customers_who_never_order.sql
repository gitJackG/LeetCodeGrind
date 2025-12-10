# Write your MySQL query statement below
SELECT c1.name as Customers
FROM Customers c1
LEFT JOIN Orders o1
ON c1.id = o1.customerId
WHERE o1.customerId IS NULL
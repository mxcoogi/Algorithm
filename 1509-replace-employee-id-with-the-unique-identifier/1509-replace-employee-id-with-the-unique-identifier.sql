# Write your MySQL query statement below
select unique_id, name from employeeUNI u
right outer join employees e on u.id = e.id;
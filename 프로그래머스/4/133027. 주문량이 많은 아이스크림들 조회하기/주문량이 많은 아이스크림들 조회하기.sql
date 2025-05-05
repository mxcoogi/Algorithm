select f.flavor from first_half f
join 
(select flavor, sum(total_order) as total_order from july
group by flavor) sub
on f.flavor = sub.flavor
group by f.flavor
order by f.total_order + sub.total_order desc limit 3;
select i.flavor from icecream_info i
join 
(select flavor, sum(total_order) from first_half
group by flavor
having sum(total_order) > 3000) f
on i.flavor = f.flavor
where i.ingredient_type = 'fruit_based';
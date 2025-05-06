select b.author_id, a.author_name, b.category, sum(bs.sales* b.price)  from book_sales bs
join book b on bs.book_id = b.book_id
join author a on b.author_id = a.author_id
where date_format(bs.sales_date,'%Y-%m') = '2022-01'
group by 1, 3
order by 1, 3 desc
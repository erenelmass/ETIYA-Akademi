# 22.11.2022 SQL ÖDEV

## * Ürün sayısına göre kategori sıralaması (GROUP BY)
`select Sum(stock), categories.name from categories
inner join product on categories.id = product.category_id
group by categories.name;`

<img src="28.11.22_SQL_Ödev/r1.png" width=25% height=25%>
## * A ve H arasındaki şehir isimleri (ORDER BY)
`Select * from city 
where city_name between 'A' and 'H' 
order by city_name`

<img src="28.11.22_SQL_Ödev/r2.png" width=25% height=25%>
## * Ürün ismine göre ürün fiyatı değiştirme (UPDATE)
`Update product 
set unit_price = '1999.00'
where name = 'Kolye'`

<img src="28.11.22_SQL_Ödev/r3p1.png" width=25% height=25%>
<img src="28.11.22_SQL_Ödev/r3p2.png" width=25% height=25%>
## * İçinde Fransa, Türkiye ve Arjantin olan adreslere sahip userlar (IN)
`Select first_name,last_name from users
inner join address on users.address_id = address.id
inner join country on address.country_id = country.id
where country.country_name in ('Fransa', 'Türkiye', 'Arjantin')`

<img src="28.11.22_SQL_Ödev/r4.png" width=25% height=25%>
## * Bütün bölgeler ve şehirler (LEFT JOIN)
`Select * from district
left join city on district.id = city.district_id`

<img src="28.11.22_SQL_Ödev/r5.png" width=25% height=25%>
## * Bütün kullanıcılar ve siparişler (RIGHT JOIN)
`Select * from orders
right join customer on orders.customer_id = customer.id`

<img src="28.11.22_SQL_Ödev/r6.png" width=25% height=25%>
## * Renklerin ve ürünlerin hepsini (FULL OUTER JOIN)
`Select color.name as "Renk", product.name "Ürün" from product
full outer join color on product.color_id = color.id
order by product.name`

<img src="28.11.22_SQL_Ödev/r7.png" width=25% height=25%>

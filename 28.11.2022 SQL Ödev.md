# 22.11.2022 SQL ÖDEV

## * Ürün sayısına göre kategori sıralaması (GROUP BY)
`select Sum(stock), categories.name from categories
inner join product on categories.id = product.category_id
group by categories.name;`

<p  align="center">
<img src="28.11.22_SQL_Ödev/r1.png" width=40% height=40%>
  </p>

## * A ve H arasındaki şehir isimleri (ORDER BY)
`select * from city where city_name between 'A' and 'H' order by city_name`

<p  align="center">
<img src="28.11.22_SQL_Ödev/r2.png" width=40% height=40%>
  </p>
  
## * Ürün ismine göre ürün fiyatı değiştirme (UPDATE)
`Update product set unit_price = '1999.00' where name = 'Kolye'`

<p  align="center">
<img src="28.11.22_SQL_Ödev/r3p1.png" width=60% height=60%>
<img src="28.11.22_SQL_Ödev/r3p2.png" width=60% height=60%>
  </p>
  
## * İçinde Fransa, Türkiye ve Arjantin olan adreslere sahip userlar (IN)
`Select first_name,last_name from users
inner join address on users.address_id = address.id
inner join country on address.country_id = country.id
where country.country_name in ('Fransa', 'Türkiye', 'Arjantin')`

<p  align="center">
<img src="28.11.22_SQL_Ödev/r4.png" width=40% height=40%>
  </p>
  
## * Bütün bölgeler ve şehirler (LEFT JOIN)
`Select * from district
left join city on district.id = city.district_id`

<p  align="center">
<img src="28.11.22_SQL_Ödev/r5.png" width=40% height=40%>
  </p>
  
## * Bütün kullanıcılar ve siparişler (RIGHT JOIN)
`Select * from orders
right join customer on orders.customer_id = customer.id`

<p  align="center">
<img src="28.11.22_SQL_Ödev/r6.png" width=60% height=60%>
  </p>
  
## * Renklerin ve ürünlerin hepsini (FULL OUTER JOIN)
`Select color.name as "Renk", product.name "Ürün" from product
full outer join color on product.color_id = color.id
order by product.name`

<p  align="center">
<img src="28.11.22_SQL_Ödev/r7.png" width=40% height=40%>
  </p>

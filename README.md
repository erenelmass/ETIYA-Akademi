# 22.11.2022 SQL ÖDEV

## * Ürün sayısına göre kategori sıralaması (GROUP BY)
`select Sum(stock), categories.name from categories
inner join product on categories.id = product.category_id
group by categories.name;`
<img src="28.11.22_SQL_Ödev/r1.png" width=50% height=50%>
## * A ve H arasındaki şehir isimleri (ORDER BY)
![Query 2](28.11.22_SQL_Ödev/q2.png)
![Result 2](28.11.22_SQL_Ödev/r2.png)
## * Ürün ismine göre ürün fiyatı değiştirme (UPDATE)
![Query 3](28.11.22_SQL_Ödev/q3.png)
![Result 3](28.11.22_SQL_Ödev/r3p1.png)
![Result 3](28.11.22_SQL_Ödev/r3p2.png)
## * İçinde Fransa, Türkiye ve Arjantin olan adreslere sahip userlar (IN)
![Query 4](28.11.22_SQL_Ödev/q4.png)
![Result 4](28.11.22_SQL_Ödev/r4.png)
## * Bütün bölgeler ve şehirler (LEFT JOIN)
![Query 5](28.11.22_SQL_Ödev/q5.png)
![Result 5](28.11.22_SQL_Ödev/r5.png)
## * Bütün kullanıcılar ve siparişler (RIGHT JOIN)
![Query 6](28.11.22_SQL_Ödev/q6.png)
![Result 6](28.11.22_SQL_Ödev/r6.png)
## * Renklerin ve ürünlerin hepsini (FULL OUTER JOIN)
![Query 7](28.11.22_SQL_Ödev/q7.png)
![Result 7](28.11.22_SQL_Ödev/r7.png)

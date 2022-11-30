-- Tarih farkını alma
------------------------------------------------------------------------------------------------

CREATE OR REPLACE FUNCTION Date_Diff (unit VARCHAR(30), date1 TIMESTAMP, date2 TIMESTAMP)
    RETURNS INT AS $$
DECLARE 
    diff_interval INTERVAL;
    diff INT = 0;
    years_diff INT=0;
BEGIN
    IF unit IN ('yy','yyyy','year','mm','m','month') THEN
        years_diff=DATE_PART('year',date2) - DATE_PART('year',date1);

        IF unit IN ('yy', 'yyyy', 'year') THEN
            RETURN years_diff;
        ELSE
            RETURN years_diff * 12 + (DATE_PART('month',date2)- DATE_PART('month',date1));
        END IF;
    END IF;

    diff_interval = date2 - date1;

    diff= diff + DATE_PART('day',diff_interval);

    IF unit IN ('wk','ww','week') THEN 
        diff=diff/7;
        RETURN diff;
    END IF;

    IF unit IN ('dd','d','day') THEN
        RETURN diff;
    END IF;

    diff= diff60+DATE_PART('minute',diff_interval);

    IF unit IN ('mi','n','minute') THEN
        RETURN diff;
    END IF;

    diff= diff60+DATE_PART('second',diff_interval);

    RETURN diff;
END;
$$ LANGUAGE plpgsql;


SELECT Date_Diff('year', '2011-12-29'::timestamp, '2012-12-30'::timestamp);
------------------------------------------------------------------------------------------------
-- Ürünün id'si ... olanı getirme
CREATE OR REPLACE FUNCTION PRODUCTGETBYID (param_id int) 
     RETURNS TEXT AS $$
   DECLARE
   product_name TEXT;
   BEGIN
     product_name = product.name from product where id = param_id;
     RETURN product_name;
   END;
   $$ LANGUAGE plpgsql;

   SELECT PRODUCTGETBYID (3);
------------------------------------------------------------------------------------------------
-- Ülkesi Türkiye olan kullanıcılar
    create view Turkey_Customers as
    select first_name as "Ad", last_name as "Soyad" from users
    inner join address on users.address_id = address.id
    inner join country on address.country_id = country.id
    where country_name = 'Türkiye'
	
	select * from Turkey_Customers

-- Kategorisi akıllı telefon olan ürünler
    create view Akıllı_Telefonlar as 
    select product.product_name as "Ürün Adı" from product
    inner join categories on product.category_id = categories.id
    where categories.category_name = 'Akıllı Telefon'
	
	select * from Akıllı_Telefonlar
﻿INSERT INTO role (id, role, description) VALUES
	(1, 'ADMIN', ''),
	(2, 'USER', ''),
	(3, 'ACCOUNTANT',''),
	(4, 'MANAGER',''),
	(5, 'SUPER_ADMIN','');

	INSERT INTO public.company(
    	 name, description, pan_no, state, zone, district, mun_vdc, ward_no, phone)
    	VALUES ('nabin', 'hello There', 23456783245678, 02, 'bagmati', 'kathmandu', 'alocknagar', 01, 9848859416);


    	insert into bill_no_generator
        (
            fiscal_year,
            bill_no,
            active,
            company_id,
            branch_id
        ) values
        (
            '2079/80',
            1,
            true,
            1,
            1
        )


INSERT INTO districts (district_id, district_name, province_id, disabled) VALUES (1, 'Achham', 7, b'0'),
 (2, 'Arghakhanchi', 5, b'0'),
 (3, 'Baglung', 4, b'0'),
 (4, 'Baitadi', 7, b'0'),
 (5, 'Bajhang', 7, b'0'),
 (6, 'Bajura', 7, b'0'),
 (7, 'Banke', 5, b'0'),
 (8, 'Bara', 2, b'0'),
 (9, 'Bardiya', 5, b'0'),
 (10, 'Bhaktapur', 3, b'0'),
 (11, 'Bhojpur', 1, b'0'),
 (12, 'Chitwan', 3, b'0'),
 (13, 'Dadeldhura', 2, b'0'),
 (14, 'Dailekh', 6, b'0'),
 (15, 'Dang Deukhuri', 5, b'0'),
 (16, 'Darchula', 7, b'0'),
 (17, 'Dhading', 3, b'0'),
 (18, 'Dhankuta', 1, b'0'),
 (19, 'Dhanusa', 2, b'0'),
 (20, 'Dolakha', 3, b'0'),
 (21, 'Dolpa', 6, b'0'),
 (22, 'Doti', 7, b'0'),
 (23, 'Gorkha', 4, b'0'),
 (24, 'Gulmi', 5, b'0'),
 (25, 'Humla', 6, b'0'),
 (26, 'Ilam', 1, b'0'),
 (27, 'Jajarkot', 6, b'0'),
 (28, 'Jhapa', 1, b'0'),
 (29, 'Jumla', 6, b'0'),
 (30, 'Kailali', 7, b'0'),
 (31, 'Kalikot', 6, b'0'),
 (32, 'Kanchanpur', 7, b'0'),
 (33, 'Kapilvastu', 5, b'0'),
 (34, 'Kaski', 4, b'0'),
 (35, 'Kathmandu', 3, b'0'),
 (36, 'Kavrepalanchok', 3, b'0'),
 (37, 'Khotang', 1, b'0'),
 (38, 'Lalitpur', 3, b'0'),
 (39, 'Lamjung', 4, b'0'),
 (40, 'Mahottari', 2, b'0'),
 (41, 'Makwanpur', 3, b'0'),
 (42, 'Manang', 4, b'0'),
 (43, 'Morang', 1, b'0'),
 (44, 'Mugu', 6, b'0'),
 (45, 'Mustang', 4, b'0'),
 (46, 'Myagdi', 4, b'0'),
 (47, 'Nawalparasi East', 4, b'0'),
 (48, 'Nawalparasi West', 5, b'0'),
 (49, 'Nuwakot', 3, b'0'),
 (50, 'Okhaldhunga', 1, b'0'),
 (51, 'Palpa', 5, b'0'),
 (52, 'Panchthar', 1, b'0'),
 (53, 'Parbat', 4, b'0'),
 (54, 'Parsa', 2, b'0'),
 (55, 'Pyuthan', 5, b'0'),
 (56, 'Ramechhap', 3, b'0'),
 (57, 'Rasuwa', 3, b'0'),
 (58, 'Rautahat', 2, b'0'),
 (59, 'Rolpa', 5, b'0'),
 (60, 'Rukum East', 5, b'0'),
 (61, 'Rukum West', 6, b'0'),
 (62, 'Rupandehi', 5, b'0'),
 (63, 'Salyan', 6, b'0'),
 (64, 'Sankhuwasabha', 1, b'0'),
 (65, 'Saptari', 2, b'0'),
 (66, 'Sarlahi', 2, b'0'),
 (67, 'Sindhuli', 3, b'0'),
 (68, 'Sindhupalchok', 3, b'0'),
 (69, 'Siraha', 2, b'0'),
 (70, 'Solukhumbu', 1, b'0'),
 (71, 'Sunsari', 1, b'0'),
 (72, 'Surkhet', 6, b'0'),
 (73, 'Syangja', 4, b'0'),
 (74, 'Tanahu', 4, b'0'),
 (75, 'Taplejung', 1, b'0'),
 (76, 'Tehrathum', 1, b'0'),
 (77, 'Udayapur', 1, b'0');



 INSERT INTO province (province_id, province_name,disabled) VALUES
     	(1, 'Province No. 1' ,b'0'),
     	(2, 'Province No. 2', b'0'),
     	(3, 'Bagmati Province', b'0'),
     	(4, 'Gandaki Province', b'0'),
     	(5, 'Lumbini Province', b'0'),
     	(6, 'Karnali Province',b'0'),
     	(7, 'Sudurpashchim Province', b'0');


  INSERT INTO municipality (municipality_id, municipality_name,province_id, district_id, disabled) VALUES
     	(1, 'Kathmandu Metropolitan City', 3, 35, b'0'),
     	(2, 'Budanilkantha Municipality',3, 35, b'0'),
     	(3, 'Chandragiri Municipality', 3, 35, b'0'),
     	(4, 'Dakshinkali Municipality',3, 35, b'0'),
     	(5, 'Gokarneshwar Municipality', 3, 35, b'0'),
     	(6, 'Kageshwari Manohara Municipality', 3, 35, b'0'),
     	(7, 'Kirtipur Municipality', 3, 35, b'0'),
     	(8, 'Nagarjun Municipality', 3, 35, b'0'),
     	(9, 'Shankharapur Municipality', 3, 35, b'0'),
     	(10, 'Tarakeshwar Municipality',3, 35, b'0'),
     	(11, 'Tokha Municipality', 3, 35, b'0'),
     	(12, 'Lalitpur Metropolitan City', 3, 38, b'0'),
     	(13, 'Mahalaxmi Municipality', 3, 38, b'0'),
     	(14, 'Godawari Municipality',3, 38, b'0'),
     	(15, 'Konjyoson Rural Municipality', 3, 38, b'0'),
     	(16, 'Bagmati Rural Municipality',3, 38, b'0'),
     	(17, 'Mahankal Rural Municipality', 3, 38, b'0'),
     	(18, 'Bhaktapur Municipality', 3, 10, b'0'),
     	(19, 'Changunarayan Municipality',3, 10, b'0'),
     	(20, 'Madhyapur Thimi Municipality', 3, 10, b'0'),
     	(21, 'Suryabinayak Municipality', 3, 10, b'0');

     	 INSERT INTO payment_mode (id, mode_name) VALUES
             	(1, 'cash' ),
             	(2, 'cheque'),
             	(3, 'bank_redirect'),
             	(4, 'ebanking');


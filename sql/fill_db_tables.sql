INSERT INTO city (display_name) VALUES('Saarbrucken');
INSERT INTO city (display_name) VALUES('Frankfurt');
INSERT INTO city (display_name) VALUES('Izmail');

INSERT INTO user_profile (first_name, last_name, username, password, created_at)
VALUES('Johan','Qeqoos','Gogegnchoden','82a3f212c95c1516907f27e1220c6f12','2023-04-23 22:23:54+02');
INSERT INTO user_profile (first_name, last_name, username, password, created_at)
VALUES('Sorgan','Brecher','Nickelstadt','82a3f212c95c1516907f27e1220c6f13','2022-05-12 10:56:54+02');

INSERT INTO flight (departure_city_id, arrival_city_id, departure_time, arrival_time, flight_number, price, created_at)
VALUES(1,2,'2023-04-23 22:23:54+02','2023-04-23 22:23:54+02',1235,55.23,'2023-04-23 22:23:54+02');
INSERT INTO flight (departure_city_id, arrival_city_id, departure_time, arrival_time, flight_number, price, created_at)
VALUES(2,3,'2023-05-19 14:23:54+02','2023-05-20 08:02:42+02',1337,250.53,'2023-04-25 16:42:01+02');

INSERT INTO ticket (flight_id, user_profile_id, pnr, created_at)
VALUES(1,2,'pivopivopivopivo','2023-04-23 22:23:54+02');
INSERT INTO ticket (flight_id, user_profile_id, pnr, created_at)
VALUES(2,1,'stockenblocken','2023-04-19 00:00:42+02');
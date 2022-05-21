INSERT INTO tiendaspring.product (codigo_producto, product_name, price, marca, product_picture, descripcion) VALUES(1,'Tarjeta Nvidia gtx 1650',300000,'Nvidia','2','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut sem lectus. Cras eu turpis semper, pulvinar turpis eget, elementum lorem. Curabitur pellentesque efficitur mi.');
INSERT INTO tiendaspring.product (codigo_producto, product_name, price, marca, product_picture, descripcion) VALUES(2,'Tarjeta Nvidia gtx 1650',300000,'Nvidia','2','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut sem lectus. Cras eu turpis semper, pulvinar turpis eget, elementum lorem. Curabitur pellentesque efficitur mi.');
INSERT INTO tiendaspring.product (codigo_producto, product_name, price, marca, product_picture, descripcion) VALUES(3,'Tarjeta Nvidia gtx 1650',300000,'Nvidia','2','Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec ut sem lectus. Cras eu turpis semper, pulvinar turpis eget, elementum lorem. Curabitur pellentesque efficitur mi.');

INSERT INTO tiendaspring.user (rut, username, password, correo) VALUES(1,'User1','Password1','correo1@mail.cl');
INSERT INTO tiendaspring.user (rut, username, password, correo) VALUES(2,'User2','Password2','correo2@mail.cl');
INSERT INTO tiendaspring.user (rut, username, password, correo) VALUES(3,'User3','Password3','correo3@mail.cl');

INSERT INTO tiendaspring.compras (precio, compra_fecha, id, rut, codigo_producto) VALUES(300000,'1970-01-01 00:00:01','1',1,1);
INSERT INTO tiendaspring.compras (precio, compra_fecha, id, rut, codigo_producto) VALUES(300000,'1970-01-01 00:00:01','2',2,2);
INSERT INTO tiendaspring.compras (precio, compra_fecha, id, rut, codigo_producto) VALUES(300000,'1970-01-01 00:00:01','3',3,3);
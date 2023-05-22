INSERT INTO tb_group (name) VALUES ('Alkali Metal');
INSERT INTO tb_group (name) VALUES ('Alkaline Earth');
INSERT INTO tb_group (name) VALUES ('Transation Metal');
INSERT INTO tb_group (name) VALUES ('Semi Metal');

INSERT INTO tb_quemical_element (name, atomic_number, group_id) VALUES ('Lithium',3,1);
INSERT INTO tb_quemical_element (name, atomic_number, group_id) VALUES ('Sodium',11,1);
INSERT INTO tb_quemical_element (name, atomic_number, group_id) VALUES ('Magnesium',12,2);
INSERT INTO tb_quemical_element (name, atomic_number, group_id) VALUES ('Calcium',20,2);
INSERT INTO tb_quemical_element (name, atomic_number, group_id) VALUES ('Titanium',22,3);

INSERT INTO tb_category (name) VALUES ('Televisão');
INSERT INTO tb_category (name) VALUES ('Cozinha');
INSERT INTO tb_category (name) VALUES ('banheiro');

INSERT INTO tb_product (name, price) VALUES ('Smart TV Sansung 50 polegadas', 1990.5);
INSERT INTO tb_product (name, price) VALUES ('Fogão 5 bocas', 499.0);
INSERT INTO tb_product (name, price) VALUES ('Geladeira', 1250.0);
INSERT INTO tb_product (name, price) VALUES ('Tapete antiderrapante', 60.0);

INSERT INTO tb_product_category (product_id, category_id) VALUES (1,1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4,2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4,3);
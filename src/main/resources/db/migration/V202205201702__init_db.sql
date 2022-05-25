CREATE TABLE shop
(
    id                  SERIAL          PRIMARY KEY,
    name                VARCHAR(32)     NOT NULL
);

CREATE TABLE product_type
(
    id                  SERIAL          PRIMARY KEY,
    type                VARCHAR(32)     NOT NULL
);

CREATE TABLE manufacturer
(
    id                  SERIAL          PRIMARY KEY,
    name                VARCHAR(32)     NOT NULL
);

CREATE TABLE product
(
    id                  SERIAL          PRIMARY KEY,
    product_type_id     INT             NOT NULL         REFERENCES product_type (id),
    manufacturer_id     INT             NOT NULL         REFERENCES manufacturer (id),
    price               DECIMAL(3, 2)   NOT NULL,
    shop_id             INT             NOT NULL         REFERENCES shop (id),
    price_update_date   DATE            NOT NULL,
    quantity            INT             NOT NULL,
    quantity_unit       VARCHAR(10)     NOT NULL
)
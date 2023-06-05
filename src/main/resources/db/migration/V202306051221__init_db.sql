CREATE TABLE address
(
    id                  SERIAL          PRIMARY KEY,
    build_number        VARCHAR(100)    NOT NULL,
    street              VARCHAR(100)    NOT NULL,
    city                VARCHAR(100)    NOT NULL,
    country             VARCHAR(50)     NOT NULL
);

CREATE TABLE shop
(
    id                  SERIAL          PRIMARY KEY,
    name                VARCHAR(50)     NOT NULL,
    address_id          INT             NOT NULL        REFERENCES address (id)
);

CREATE TABLE product_type
(
    id                  SERIAL          PRIMARY KEY,
    type                VARCHAR(50)     NOT NULL
);

CREATE TABLE brand
(
    id                  SERIAL          PRIMARY KEY,
    name                VARCHAR(50)     NOT NULL
);

CREATE TABLE product
(
    id                  SERIAL          PRIMARY KEY,
    product_type_id     INT             NOT NULL         REFERENCES product_type (id),
    price               DECIMAL(3, 2)   NOT NULL,
    shop_id             INT             NOT NULL         REFERENCES shop (id),
    date_of_purchase    DATE            NOT NULL,
    brand_id            INT             NOT NULL         REFERENCES brand (id)
)
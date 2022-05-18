CREATE TABLE shop
(
    id          SERIAL          PRIMARY KEY,
    name        VARCHAR(32)     NOT NULL
);

CREATE TABLE product
(
    id          SERIAL          PRIMARY KEY,
    name        VARCHAR(15)     NOT NULL,
    price       DECIMAL(3, 2)   NOT NULL,
    shop_id     INT             NOT NULL REFERENCES shop (id)
)
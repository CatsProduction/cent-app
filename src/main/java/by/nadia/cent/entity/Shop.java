package by.nadia.cent.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
@Getter
@Setter(AccessLevel.PUBLIC)
public class Shop {
}

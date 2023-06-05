package by.nadia.cent.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
@RequiredArgsConstructor
@Getter
@Setter(AccessLevel.PUBLIC)
@ToString
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "build_number", length = 100, nullable = false)
    private String buildNumber;

    @Column(name = "street", length = 100, nullable = false)
    private String street;

    @Column(name = "city", length = 100, nullable = false)
    private String city;

    @Column(name = "country", length = 100, nullable = false)
    private String country;
}

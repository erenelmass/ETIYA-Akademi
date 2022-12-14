package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "email")
    private String email;

    @Column(name = "address_id")
    private int address_id;

    @Column(name = "password")
    private String password;

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "address_id")
    @JsonIgnoreProperties("users")
    private Address address;

    @OneToMany(mappedBy = "id")
    @JsonIgnoreProperties("id")
    private List<Salesman> salesmen;

    @OneToMany(mappedBy = "id")
    @JsonIgnoreProperties("id")
    private List<Customer> customers;
}

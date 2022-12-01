package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "payment_id")
    private int payment_id;

    @Column(name = "role_id")
    private int role_id;

    @Column(name = "user_id")
    private int user_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("customers")
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonIgnoreProperties("customers")
    private Role role;

    @OneToMany(mappedBy = "id")
    @JsonIgnoreProperties("id")
    private List<Order> orders;
}

package com.etiya.ecommercedemopair2.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "city_name")
    private String city_name;

    @Column(name = "district_id")
    private int district_id;

    @ManyToOne
    @JoinColumn(name = "district_id")
    @JsonIgnoreProperties("city")
    private District district;

    @OneToMany(mappedBy = "id")
    @JsonIgnoreProperties("id")
    private List<Country> countries;
}

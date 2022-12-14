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
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_date")
    private Date order_date;

    @Column(name = "ship_date")
    private Date ship_date;

    @Column(name = "shipper_id")
    private int shipper_id;

    @Column(name = "payment_id")
    private int payment_id;

    @Column(name = "customer_id")
    private int customer_id;

    @ManyToOne
    @JoinColumn(name = "shipper_id")
    @JsonIgnoreProperties("orders")
    private Shipper shipper;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    @JsonIgnoreProperties("orders")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonIgnoreProperties("orders")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    @JsonIgnoreProperties("order")
    private List<OrderDetail> orderDetails;
}

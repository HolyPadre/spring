package com.example.assignment2.Entity;


import lombok.*;

import javax.persistence.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_order")
public class product_order {

    @ManyToOne
    @JoinColumn(name = "product_id")
    private product product_id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private product order_id;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "price")

    private double price;
    @Column(name = "vat")

    private int vat;
}

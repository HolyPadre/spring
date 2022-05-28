package com.example.assignment2.Entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue
    private Long order_id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private customer customer;
    @Column(name = "orderAt")
    private Date orderAt;
}

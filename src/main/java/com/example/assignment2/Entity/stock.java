package com.example.assignment2.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stock")
public class stock {
    @Id
    @GeneratedValue
    private Long stock_id ;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private product product_id ;

    @Column(name = "quantity")
    private int quantity ;
    @Column(name = "updateAt")
    private LocalDateTime updateAt ;


}

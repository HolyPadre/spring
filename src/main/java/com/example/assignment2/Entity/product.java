package com.example.assignment2.Entity;

import lombok.*;

import javax.persistence.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "product")
public class product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "name",nullable = false)
    private String name ;

    @Column(name = "price",nullable = false)
    private Double price ;



}

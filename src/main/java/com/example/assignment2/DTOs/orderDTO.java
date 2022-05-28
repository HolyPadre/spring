package com.example.assignment2.DTOs;

import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class orderDTO {
    private Long order_id ;

    private Long customer_id ;

    private Date orderAt ;
}

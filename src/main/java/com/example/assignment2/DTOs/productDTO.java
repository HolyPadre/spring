package com.example.assignment2.DTOs;


import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class productDTO {
   private Long product_id ;
   private String name ;
   private double price ;

}

package com.example.assignment2.DTOs;

import lombok.*;

import java.util.Date;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class customerDTO {

  private Long customer_id ;
  private String first_name ;
  private String last_name ;
  private Date bornAt ;
}

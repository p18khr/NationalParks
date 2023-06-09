package com.NationalPark.models;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateActivity {
	private Long id;
	private String name;
	private double price;
	private String about;
	private String image;
}

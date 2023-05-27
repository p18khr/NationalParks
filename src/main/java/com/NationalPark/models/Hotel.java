package com.NationalPark.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="hotel")
public class Hotel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private double price;

	@Column(length = 1000)
	private String about;

	private String location;

	@Column(length = 100000)
	private String image;

	private Long park_id;

	private String ac;
	private String pool;
	private String room;
	private String wifi;
	private String laundry;
}

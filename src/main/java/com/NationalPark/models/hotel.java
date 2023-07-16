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
public class hotel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private double price;

	@Column(length = 1000)
	private String about;

	private String location;

	@Column(length = 100000)
	private String image1;

	@Column(length = 100000)
	private String image2;

	@Column(length = 100000)
	private String image3;

	@Column(length = 100000)
	private String image4;

	@Column(length = 100000)
	private String image5;

	@Column(length = 100000)
	private String image6;

	@Column(length = 100000)
	private String image7;

	@Column(length = 100000)
	private String image8;

	@Column(length = 100000)
	private String image9;

	@Column(length = 100000)
	private String image10;

	private Long park_id;

	private String ac;
	private String pool;
	private String room = "Yes";
	private String wifi;
	private String laundry;
}

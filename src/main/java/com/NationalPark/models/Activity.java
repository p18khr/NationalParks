package com.NationalPark.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="activity")
public class Activity {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private double price;

	@Column(length = 1000)
	private String about;

	@Column(length = 100000)
    private String image;
	private Long park_id;
	private String type;

	private int frequency=0;
}

package com.NationalPark.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="park")
public class Park {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String city;

	private String state;

	@Column(length = 100000)
	private String image;

	@Column(length = 8000)
	private String about;

	@Transient
	private ArrayList<String> hotelsList;

	@Transient
	private ArrayList<String> activitiesList;

}

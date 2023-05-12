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
	private String id;

	@Column(name="name",nullable = false)
	private String name;

	@Column(name="price",nullable = false)
	private double price;

	@Column(name="about",nullable = false)
	private String about;

	@Column(name="location",nullable = false)
	private String location;

	@Column(name="image",nullable = false)
	private String image;

	@Column(name="park_id",nullable = false)
	private int park_id;
}

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
	private String id;

	@Column(name="name",nullable = false)
	private String name;

	@Column(name="city",nullable = false)
	private String city;

	@Column(name="state",nullable = false)
	private String state;

	@Column(name="image",nullable = false)
	private String image;

	@Column(name="about",nullable = false)
	private String about;

	@Column(name="activity",nullable = false)
	private String activity;

	@Column(name="hotel",nullable = false)
	private String hotel;


	@Transient
	private ArrayList<String> hotelsList;

	@Transient
	private ArrayList<String> activitiesList;

}

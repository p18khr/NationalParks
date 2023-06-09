package com.NationalPark.models;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="safari_enquiry")
public class SafariEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String contact;
	private String email;
	private String city;
	private int adult;
	private int kid;
	private String visiting_date;
	private String park_id;
	private String safari;
	private String activity;
	private int gypsy;
	private Long estimate_package;
}

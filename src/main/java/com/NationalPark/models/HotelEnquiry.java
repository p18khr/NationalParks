package com.NationalPark.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="hotel_enquiry")
public class HotelEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String contact;
	private String email;
	private String city;
	private int adult;
	private int kid;
	private String check_in;
	private String check_out;
	private int days;
	private String park_id;
	private String safari;
	private String activity;
	private String hotel;
	private int room;
	private Long estimate_package;
}

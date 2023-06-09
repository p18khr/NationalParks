package com.NationalPark.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="enquiry")
public class Enquiry {

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

}

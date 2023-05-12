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
@Table(name="user_enquiry")
public class UserEnquiry {

    @Id
    private String id;

	private String name;
	private String email;
	private String city;
	private String state;

	@Column(length = 10)
	private String contact_no;

	private int adults;
	private int kids;
	private Date check_in;
	private Date check_out;
	private String visiting_park;
	private String activities;
	private String hotel;
}

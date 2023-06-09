package com.NationalPark.models;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilterBody {
	private String park_name;
	private String state;
	private String city;
	private String activity_name;
}

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
	private String id;

	private String name;
	private double price;
	private int park_id;
}

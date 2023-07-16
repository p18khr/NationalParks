package com.NationalPark.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="blog")
public class blog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String title;

	@Column(length = 1000000)
	private String content;
	private String timestamp;
	private String image;
}

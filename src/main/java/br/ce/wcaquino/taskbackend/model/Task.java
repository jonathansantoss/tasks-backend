package br.ce.wcaquino.taskbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String task;
	
	@Column(nullable = false)
	private LocalDate dueDate;
}

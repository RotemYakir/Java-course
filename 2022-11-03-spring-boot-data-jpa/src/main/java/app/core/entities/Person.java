package app.core.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	

	
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //auto increment
	private int id;
	private String name;
	private int age;

}

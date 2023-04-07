package app.core.beans;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of="id")
public class Person {
	
	private int id;
	private String name;
	private int age;
	
}

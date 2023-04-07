package app.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Entity
@ToString(exclude = { "examples" })
public class Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String word;
	private String definition;

	@OneToMany(mappedBy = "entry", cascade = CascadeType.ALL)
	private List<Example> examples;

	public Entry(int id, String word, String defenition, List<Example> examples) {
		super();
		this.id = id;
		this.word = word;
		this.definition = defenition;
		if (examples != null) {
		this.setExamples(examples);
		}
		}

	public void setExamples(List<Example> examples) {
		this.examples = examples;
		for (Example example : this.examples) {
			example.setEntry(this); // bind the example to the entry
		}
	}

	public void addExample(Example example) {
		if (this.examples == null) {
			this.examples = new ArrayList<>();
		}
		example.setEntry(this);
		this.examples.add(example); // bind the example to the entry
	}

	public Entry(int id, String word, String definition) {
		super();
		this.id = id;
		this.word = word;
		this.definition = definition;
	}

	

}

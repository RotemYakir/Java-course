package school;

public class Teacher extends Person {
	
	Profession profession; // math, chemistry, geography, literature, physics, sports

	public Teacher(String name, int age,  Profession profession) {
		super(name, age);
		this.profession = profession;
	}
	
	

	public Teacher() {
		
	}



	public Profession getProfession() {
		return profession;
	}

	public void setRandomProfession(Profession professions[]){
		this.profession = professions[(int)(Math.random()*professions.length)];
	}



	@Override
	public String toString() {
		return "Teacher [name= " + this.getName() +" profession= " + profession + "]";
	}
	
	
	

}

package school;

public class Grade {
	
	private Profession profession; // math, chemistry, geography, literature, physics, sports
	private int score; //values 40-100
	
	
	public Grade(Profession profession, int score) {
		super();
		this.profession = profession;
		this.setScore(score);
	}


	public Profession getProfession() {
		return profession;
	}


	public void setProfession(Profession profession) {
		this.profession = profession;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		if (score>39&&score<101) {			
		this.score = score;
		}
	}


	@Override
	public String toString() {
		return "Grade [profession=" + profession + ", score=" + score + "]";
	}
	

	
}

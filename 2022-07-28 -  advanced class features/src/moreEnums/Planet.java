package moreEnums;

public enum Planet {
	
	
	// a constant set of planets
	MERQURY("Merqury",58,5),
	VENUS("Venus",66,9),
	MARS("Mars",33,7),
	EARTH("Earth",55,4)
	;
	
	//fields can be final or not
	private String name;
	private int orbit;
	private int gravitation;
	
	
	private Planet(String name, int orbit, int gravitation) {
		this.name = name;
		this.orbit = orbit;
		this.gravitation = gravitation;
	}


	public String getName() {
		return name;
	}


	public int getOrbit() {
		return orbit;
	}


	public int getGravitation() {
		return gravitation;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setOrbit(int orbit) {
		this.orbit = orbit;
	}


	public void setGravitation(int gravitation) {
		this.gravitation = gravitation;
	}
	
	
	

}

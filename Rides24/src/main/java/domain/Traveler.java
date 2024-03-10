package domain;

import java.io.Serializable;

public class Traveler extends User implements Serializable {
	
	

	public Traveler() {
		
		super();
		
	}

	public Traveler(String email, String password, String name) {
		
		super(email, password, name);

	}
	

}

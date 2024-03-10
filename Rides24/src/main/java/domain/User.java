package domain;

import java.io.Serializable;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlID;

public abstract class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlID
	@Id 
	private String email;
	private String name; 
	@XmlID
	@Id
	private String password;
	private int Cash;
	
	
	public User() {
		
		super();
		
	}
	
	public User(String email,String password,String name) {
		
		this.email = email;
		this.password = password;
		this.name = name;
		this.Cash = 0;
		
	}
	
	public User(String email,String name) {
		this.email = email;
		this.name = name;
		this.Cash = 0;
	}
	public int getCash() {
		return Cash;
	}

	public void setCash(int cash) {
		Cash = cash;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
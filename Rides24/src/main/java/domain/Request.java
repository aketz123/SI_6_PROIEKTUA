package domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Request implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int seats;
	private boolean status;
	private float moneyBalance;
	private Driver driver;
	private ArrayList<Traveler> request = new ArrayList<Traveler>();
	
	public Request() {
		super();
	}
	


	public Request(int seats, boolean status, float moneyBalance, Driver driver, ArrayList<Traveler> request) {
		this.seats = seats;
		this.status = status;
		this.moneyBalance = moneyBalance;
		this.driver = driver;
		this.request = request;
	}



	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public float getMoneyBalance() {
		return moneyBalance;
	}

	public void setMoneyBalance(float moneyBalance) {
		this.moneyBalance = moneyBalance;
	}
	
	
	
	

}

package javasmmr.zoowsome.models.animals;
import java.util.Random;
public abstract class Animal implements Killer {
	private Integer numberOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	private boolean takenCareOf=false;
	
	public Animal(double a,double b){
		this.maintenanceCost=a;
		this.dangerPerc=b;
	}

	public Integer getNumberOfLegs() {
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(Integer numberOfLegs) {
		this.numberOfLegs=numberOfLegs;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public double getmaintenanceCost() {
		return maintenanceCost;
	}
	
	public double getdangerPerc() {
		return dangerPerc;
	}
	
	public boolean gettakenCareOf() {
		return takenCareOf;
	}
	
	public void settakenCareOf(boolean takenCareOf) {
		this.takenCareOf=takenCareOf;
		
	}
	
	@Override
	public boolean kill() {
		Random r = new Random();
		double perc=r.nextDouble();
		//System.out.println(perc);
		if(perc<getdangerPerc())
			return true;
		else
			return false;
	}
	
}

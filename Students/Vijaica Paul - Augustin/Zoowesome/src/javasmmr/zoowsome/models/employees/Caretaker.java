package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	private double workingHours;
	
	public Caretaker(String name, long id, BigDecimal salary,double workingHours) {
		super(name,id,salary);
		setworkingHours(workingHours);
	}
	
		public double getworkingHours() {
			return workingHours;
		}
		
		public void setworkingHours(double workingHours) {
			this.workingHours=workingHours;
		}
		public String takeCareOf(Animal animal) {
			if(animal.kill()==true) {
				return Constants.Employees.Caretakers.TCO_KILLED;
			}
			if(this.workingHours<=animal.getmaintenanceCost()) {
				return Constants.Employees.Caretakers.TCO_NO_TIME;
			}
			else {
				return Constants.Employees.Caretakers.TCO_SUCCESS;
			}
		}
}

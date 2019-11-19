package javasmmr.zoowsome.services.factories;
import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.*;

public class EmFactory extends EmployeeFactory{
		public Employee getEmployee(String type) {
			if (Constants.Employees.Caretaker.equals(type)) {
	            return new Caretaker("john",100,BigDecimal.valueOf(1000),8.0);
	        } else {
	            return null;
	        }
		}

	}



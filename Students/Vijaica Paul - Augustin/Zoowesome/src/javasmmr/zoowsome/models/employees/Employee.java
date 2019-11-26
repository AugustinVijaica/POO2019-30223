package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;

public abstract class Employee {
		private String name;
		private long id;
		BigDecimal salary;
		private boolean isDead=false;
		
		public Employee(String name, long id, BigDecimal salary) {
			setName(name);
			setId(id);
			setSalary(salary);
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public long getId() {
			return id;
		}
		
		public void setId(long id) {
			this.id=id;
		}
		
		public BigDecimal getSalary() {
			return salary;
		}
		
		public void setSalary(BigDecimal salary) {
			this.salary=salary;
		}
		
		public boolean getStatus() {
			return isDead;
		}
		
		public void setStatus(boolean isDead) {
			this.isDead=isDead;
		}

}

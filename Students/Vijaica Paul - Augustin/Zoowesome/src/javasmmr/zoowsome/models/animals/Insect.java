package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	private Boolean canFly;
	private Boolean isDangerous;
	
	public Insect(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
	}
	
	public Boolean getFly() {
		return canFly;
	}
	
	public void setFly(Boolean canFly) {
		this.canFly=canFly;
	}
	
	public Boolean getDangerous(){
		return isDangerous;
	}
	
	public void setDangerous(Boolean isDangerous) {
		this.isDangerous=isDangerous;
	}
	
}

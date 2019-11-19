package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;
	
	public Reptile(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
	}

	public Boolean getEggs() {
		return laysEggs;
	}
	
	public void setEggs(Boolean laysEggs) {
		this.laysEggs=laysEggs;
	}
}

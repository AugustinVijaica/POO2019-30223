package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;

	public Boolean getEggs() {
		return laysEggs;
	}
	
	public void setEggs(Boolean laysEggs) {
		this.laysEggs=laysEggs;
	}
}

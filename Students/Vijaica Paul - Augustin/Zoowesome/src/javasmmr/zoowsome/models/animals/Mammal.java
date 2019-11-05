package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	
	private Float normBodyTemp;
	private Float percBodyCov;
	
	public Float getBodyTemp() {
		return normBodyTemp;
	}
	
	public void setBodyTemp(Float normBodyTemp) {
		this.normBodyTemp=normBodyTemp;
	}
	
	public Float getBodyCov() {
		return percBodyCov;
	}
	
	public void setBodyCov(Float percBodyCov) {
		this.percBodyCov=percBodyCov;
	}

}

package javasmmr.zoowsome.models.animals;
import javasmmr.zoowsome.services.factories.*;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Bee extends Insect {
	public Bee() {
		setMaintenanceCost(2.1);
		setDangerPerc(0.04);
		setNumberOfLegs(6);
	    setName("Anthophila");
	    setFly(true);
	    setDangerous(false);
	}

	public Bee(
	        Integer numberOfLegs,
	        String name,
	        Boolean canFly,
	        Boolean dangerous,
	        double maintenanceCost,double dangerPerc) {
		setMaintenanceCost(maintenanceCost);
		setDangerPerc(dangerPerc);
	    setNumberOfLegs(numberOfLegs);
	    setName(name);
	    setFly(canFly);
	    setDangerous(dangerous);

	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Bee);
	}

}

package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammal {
	
	public Cow() {
		 setMaintenanceCost(5.4);
		    setDangerPerc(0.03);
		setNumberOfLegs(4);
		setName("Bos taurus");
		setBodyTemp((float)34.3);
		setBodyCov((float)96.3);
	}
	
	public Cow(Integer numberOfLegs,
	            String name,
	            Float normBodyTemp,
	            Float percBodyCov,
	            double maintenanceCost,double dangerPerc) {
			setMaintenanceCost(maintenanceCost);
		    setDangerPerc(dangerPerc);
			setNumberOfLegs(numberOfLegs);
			setName(name);
			setBodyTemp(normBodyTemp);
			setBodyCov(percBodyCov);
	}
	

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Cow);
	}
}

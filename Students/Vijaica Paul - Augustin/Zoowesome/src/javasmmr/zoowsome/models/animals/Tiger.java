package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {
	
	public Tiger() {
		setMaintenanceCost(4.9);
	    setDangerPerc(0.73);
		setNumberOfLegs(4);
		setName("Panthera tigris");
		setBodyTemp((float)35.5);
		setBodyCov((float)98.5);
	}
	
	 public Tiger(
	            Integer numberOfLegs,
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Tiger);
		}

}

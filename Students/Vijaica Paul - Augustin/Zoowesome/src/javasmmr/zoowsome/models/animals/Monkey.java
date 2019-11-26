package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammal {
	public Monkey() {
		setMaintenanceCost(2.5);
	    setDangerPerc(0.05);
		setNumberOfLegs(4);
		setName("Patyrrhini");
		setBodyTemp((float)34.8);
		setBodyCov((float)99.3);
		
	}
	
	 public Monkey(
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Monkey);
		}

}

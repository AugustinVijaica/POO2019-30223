package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Crocodile extends Reptile{
	public Crocodile() {
		setMaintenanceCost(4.1);
	    setDangerPerc(0.91);
		setNumberOfLegs(4);
		setName("Crocodylus niloticus");
		setEggs(true);
	}
	 public Crocodile(
	            Integer numberOfLegs,
	            String name,
	            Boolean laysEggs,
	            double maintenanceCost,double dangerPerc) {
		 	setMaintenanceCost(maintenanceCost);
		    setDangerPerc(dangerPerc);
	        setNumberOfLegs(numberOfLegs);
	        setName(name);
	        setEggs(laysEggs);
	    }
	 

		public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
		{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Crocodile);
		}
}

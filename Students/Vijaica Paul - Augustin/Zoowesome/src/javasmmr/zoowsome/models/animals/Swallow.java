package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Swallow extends Bird{
	public Swallow() {
		setMaintenanceCost(1.1);
	    setDangerPerc(0.01);
		setNumberOfLegs(2);
		setName("Hirundinidae");
		setMigrates(true);
		setAvgFlightAltitude(200);
	}
	
	public Swallow(
            Integer numberOfLegs,
            String name,
            Boolean migrates,
            Integer avgFlightAltitude,
            double maintenanceCost,double dangerPerc) {
		setMaintenanceCost(maintenanceCost);
	    setDangerPerc(dangerPerc);
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setMigrates(migrates);
        setAvgFlightAltitude(avgFlightAltitude);
    }
	

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Swallow);
	}

}

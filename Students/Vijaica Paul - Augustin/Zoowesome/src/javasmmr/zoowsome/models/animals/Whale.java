package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Whale extends Aquatic {
	public Whale () {
		setMaintenanceCost(4.7);
	    setDangerPerc(0.67);
		setNumberOfLegs(0);
		setName("Balaenopteridae");
		setAvgSwimDepth(500);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Whale(
            Integer numberOfLegs,
            String name,
            Integer avgSwimDepth,
            WaterType waterType,
            double maintenanceCost,double dangerPerc) {
		setMaintenanceCost(maintenanceCost);
	    setDangerPerc(dangerPerc);
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(waterType);
    }
	

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.Whale);
	}

}

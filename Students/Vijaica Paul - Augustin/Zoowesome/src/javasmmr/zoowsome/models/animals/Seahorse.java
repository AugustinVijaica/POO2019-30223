package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Seahorse extends Aquatic {
	public Seahorse() {
		setMaintenanceCost(2.1);
	    setDangerPerc(0.02);
		setNumberOfLegs(0);
		setName("Hippocampus");
		setAvgSwimDepth(30);
		setWaterType(WaterType.FRESHWATER);
	}
	
	public Seahorse(
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
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.Seahorse);
	}
}

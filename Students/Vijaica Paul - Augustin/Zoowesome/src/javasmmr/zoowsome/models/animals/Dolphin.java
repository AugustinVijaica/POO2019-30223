package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Dolphin extends Aquatic {
	public Dolphin () {
		setMaintenanceCost(3.1);
	    setDangerPerc(0.35);
		setNumberOfLegs(0);
		setName("Actinopterygii");
		setAvgSwimDepth(350);
		setWaterType(WaterType.FRESHWATER);
	}
	
	public Dolphin(
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
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Aquatics.Dolphin);
	}

}

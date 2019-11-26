package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private WaterType waterType;
	

	public Integer getAverageSwimDepth() {
        return avgSwimDepth;
    }
	
	public void setAvgSwimDepth(Integer avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }
	
	public WaterType getWaterType() {
        return waterType;
    }
	
	public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(getAverageSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(getWaterType()));
		}
	public void decodeFromXml( Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent( )));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
		}

}

package javasmmr.zoowsome.models.animals;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.*;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Insect extends Animal {
	private Boolean canFly;
	private Boolean isDangerous;
	
	
	public Boolean getFly() {
		return canFly;
	}
	
	public void setFly(Boolean canFly) {
		this.canFly=canFly;
	}
	
	public Boolean getDangerous(){
		return isDangerous;
	}
	
	public void setDangerous(Boolean isDangerous) {
		this.isDangerous=isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getDangerous()));
		}
	public void decodeFromXml( Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent( )));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		}
	
}

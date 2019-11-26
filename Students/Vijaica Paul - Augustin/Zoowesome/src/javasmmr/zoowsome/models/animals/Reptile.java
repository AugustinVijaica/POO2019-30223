package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
	private Boolean laysEggs;
	

	public Boolean getEggs() {
		return laysEggs;
	}
	
	public void setEggs(Boolean laysEggs) {
		this.laysEggs=laysEggs;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"laysEggs",String.valueOf(getEggs()));
		}
	public void decodeFromXml( Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent( )));
		}
}

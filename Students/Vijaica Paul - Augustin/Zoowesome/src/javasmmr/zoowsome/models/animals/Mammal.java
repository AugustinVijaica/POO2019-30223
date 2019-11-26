package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {
	
	
	private Float normBodyTemp;
	private Float percBodyCov;
	
	public Float getBodyTemp() {
		return normBodyTemp;
	}
	
	public void setBodyTemp(Float normBodyTemp) {
		this.normBodyTemp=normBodyTemp;
	}
	
	public Float getBodyCov() {
		return percBodyCov;
	}
	
	public void setBodyCov(Float percBodyCov) {
		this.percBodyCov=percBodyCov;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normBodyTemp", String.valueOf(getBodyTemp()));
		createNode(eventWriter, "percBodyCov", String.valueOf(getBodyCov()));
		}
	public void decodeFromXml( Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("normBodyTemp").item(0).getTextContent( )));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("percBodyCov").item(0).getTextContent()));
		}

}

package javasmmr.zoowsome.models.animals;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.*;
import javasmmr.zoowsome.models.interfaces.*;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


public abstract class Animal implements Killer,XML_Parsable {
	private Integer numberOfLegs;
	private String name;
	private double maintenanceCost;
	private double dangerPerc;
	private boolean takenCareOf=false;
	

	public Integer getNumberOfLegs() {
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(Integer numberOfLegs) {
		this.numberOfLegs=numberOfLegs;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public double getmaintenanceCost() {
		return maintenanceCost;
	}
	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost=maintenanceCost;
	}
	
	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc=dangerPerc;
	}
	
	public double getdangerPerc() {
		return dangerPerc;
	}
	
	public boolean gettakenCareOf() {
		return takenCareOf;
	}
	
	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf=takenCareOf;
		
	}
	
	@Override
	public boolean kill() {
		Random r = new Random();
		double perc=r.nextDouble();
		//System.out.println(perc);
		if(perc<getdangerPerc())
			return true;
		else
			return false;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "numberOfLegs", String.valueOf(this.numberOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
		}
	
	public void decodeFromXml( Element element) {
		setNumberOfLegs (Integer.valueOf(element.getElementsByTagName("numberOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent()) ;
		setMaintenanceCost (Double.valueOf(element.getElementsByTagName( "maintenanceCost").item(0).getTextContent())) ;
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()) );
		}

}

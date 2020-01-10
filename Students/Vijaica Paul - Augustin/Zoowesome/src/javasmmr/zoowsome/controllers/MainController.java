package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.repositories.AnimalRepository;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, XMLStreamException {
		AnimalFactory Aquatic = new AnimalFactory();
		AnimalFactory Bird = new AnimalFactory();
		AnimalFactory Insect = new AnimalFactory();
		AnimalFactory Mammal = new AnimalFactory();
		AnimalFactory Reptile = new AnimalFactory();
		
		Animal[] animal = new Animal[5];

		SpeciesFactory speciesFactoryAquatic = Aquatic.getSpeciesFactory(Constants.Species.Aquatics);
		SpeciesFactory speciesFactoryBird = Bird.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactoryInsect = Insect.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory speciesFactoryMammal = Mammal.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactoryReptile = Reptile.getSpeciesFactory(Constants.Species.Reptiles);

		animal[0] = speciesFactoryAquatic.getAnimal(Constants.Animals.Aquatics.Seahorse);
		animal[1] = speciesFactoryBird.getAnimal(Constants.Animals.Birds.Swallow);
		animal[2] = speciesFactoryInsect.getAnimal(Constants.Animals.Insects.Bee);
		animal[3] = speciesFactoryMammal.getAnimal(Constants.Animals.Mammals.Tiger);
		animal[4] = speciesFactoryReptile.getAnimal(Constants.Animals.Reptiles.Crocodile);

		ArrayList<Animal>list=new ArrayList<Animal>();
		
		list.add(animal[0]);
		list.add(animal[1]);
		list.add(animal[2]);
		

		Caretaker[] employee=new Caretaker[5];
		employee[0]=new Caretaker("John",100,BigDecimal.valueOf(1000),3.4);
		employee[1]=new Caretaker("Fred",110,BigDecimal.valueOf(1300),4.5);
		employee[2]=new Caretaker("Franklin",130,BigDecimal.valueOf(2000),2.4);
		employee[3]=new Caretaker("Andrew",111,BigDecimal.valueOf(3400),8.0);
		employee[4]=new Caretaker("Leyla",230,BigDecimal.valueOf(10000),5.3);
		
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (employee[i].getStatus() ==false && animal[j].gettakenCareOf() == false) {
					String result = employee[i].takeCareOf(animal[j]);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						System.out.println(employee[i].getName() + " got killed by the "+ animal[j].getName());
						employee[i].setStatus(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						System.out.println("No time to take care of "+animal[j].getName() + " by "+ employee[i].getName());
						j++;
						try {
							employee[i].takeCareOf(animal[j]);
						} catch(Exception e) {
							System.out.println("The "+animal[j].getName()+"couldn't been taken care of by "+employee[i].getName());
						}
						
					} else {
						animal[j].setTakenCareOf(true);
						System.out.println("The "+animal[j].getName()+ " has got taken care of by "+employee[i].getName());
					}
				}
			}
		}
		System.out.println();
		AnimalRepository animallist=new AnimalRepository();
		animallist.save(list);
		ArrayList<Animal>XML=animallist.load();
		for(Animal c : XML) {
			System.out.println(c.getName());
		}
		System.out.println();
		list.add(animal[3]);
		list.add(animal[4]);
		list.remove(0);
		list.remove(2);
		
		animallist.save(list);
		XML=animallist.load();
		
		for(Animal c : XML) {
			System.out.println(c.getName());
		}
	}

}
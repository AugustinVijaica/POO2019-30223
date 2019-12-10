package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Bee;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Seahorse;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Swallow;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Frames;

public class AddFrame extends ZooFrame implements ActionListener {
	private JTextField Text;
	private JTextArea lista;
	public ArrayList<Animal> animals;
	private ArrayList<Animal> animals2; 

	public AddFrame(String title) {
		super(title);
		setSize(Frames.WIDTH, Frames.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		Text = new JTextField(10);
		JTextArea Antet = new JTextArea("Introduceti un animal");
		Antet.setEditable(false);
		Antet.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
		lista = new JTextArea(1, 5);
		lista.setVisible(false);
		contentPanel.add(Antet);
		contentPanel.add(Text);
		contentPanel.add(lista);
		Text.addActionListener(this);
		add(contentPanel, BorderLayout.CENTER);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		String text = Text.getText();
		animals = new ArrayList<Animal>();
		animals2= new ArrayList<Animal>();
		lista.setVisible(false);
		
		switch (text) {
		case Constants.Animals.Reptiles.Crocodile:
			Animal crocodile = new Crocodile();
			animals.add(crocodile);
			Text.setText("");
			break;
		case Constants.Animals.Reptiles.Lizard:
			Animal lizard = new Lizard();
			animals.add(lizard);
			Text.setText("");
			break;
		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake();
			animals.add(snake);
			Text.setText("");
			break;
		case Constants.Animals.Insects.Bee:
			Animal bee = new Bee();
			animals.add(bee);
			Text.setText("");
			break;
		case Constants.Animals.Insects.Cockroach:
			Animal cockroach = new Cockroach();
			animals.add(cockroach);
			Text.setText("");
			break;
		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider();
			animals.add(spider);
			Text.setText("");
			break;
		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger();
			animals.add(tiger);
			Text.setText("");
			break;
		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow();
			animals.add(cow);
			Text.setText("");
			break;
		case Constants.Animals.Mammals.Monkey:
			Animal monkey = new Monkey();
			animals.add(monkey);
			Text.setText("");
			break;
		case Constants.Animals.Aquatics.Seahorse:
			Animal seahorse = new Seahorse();
			animals.add(seahorse);
			Text.setText("");
			break;
		case Constants.Animals.Aquatics.Dolphin:
			Animal dolphin = new Dolphin();
			animals.add(dolphin);
			Text.setText("");
			break;
		case Constants.Animals.Aquatics.Whale:
			Animal whale = new Whale();
			animals.add(whale);
			Text.setText("");
			break;
		case Constants.Animals.Birds.Eagle:
			Animal eagle = new Eagle();
			animals.add(eagle);
			Text.setText("");
			break;
		case Constants.Animals.Birds.Parrot:
			Animal parrot = new Parrot();
			animals.add(parrot);
			Text.setText("");
			break;
		case Constants.Animals.Birds.Swallow:
			Animal swallow = new Swallow();
			animals.add(swallow);
			Text.setText("");

		default:
			Text.setText("");
			lista.setText("Nu este un animal!");
			lista.setVisible(true);
			break;
		}
		for(Animal c:animals) {
			lista.setVisible(true);
			lista.setText(c.getName()+"\n"+c.getdangerPerc()+"\n"+c.getNumberOfLegs());
			
		}
	}

}

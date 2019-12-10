package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants.Frames;

public class ListFrame extends AddFrame{

	public ListFrame(String title) {
		super(title);
		setSize(Frames.WIDTH, Frames.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		JTextArea Antet = new JTextArea(5,5);
		Antet.setEditable(false);
		contentPanel.add(Antet);
		add(contentPanel, BorderLayout.CENTER);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}
		
}

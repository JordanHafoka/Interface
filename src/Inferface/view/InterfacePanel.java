package Inferface.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import Interface.controller.InterfaceController;
import javax.swing.JLabel;

public class InterfacePanel extends JPanel
{
	private SpringLayout baseLayout;
	private JButton colorButton;
	private JButton imageButton;
	private JLabel label;
	private JButton numberButton;
	private JButton randomButton;
	
	public InterfacePanel()
	{
		baseLayout = new SpringLayout();
		colorButton = new JButton();
		colorButton.setText("Random Color!");
		imageButton = new JButton();
		
				baseLayout.putConstraint(SpringLayout.NORTH, imageButton, 0, SpringLayout.NORTH, colorButton);
		label = new JLabel("Image");
		numberButton = new JButton();
		randomButton = new JButton();
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 0, SpringLayout.NORTH, colorButton);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, 95, SpringLayout.EAST, imageButton);
		randomButton.setText("Randomize!");
	
		numberButton.setText("Random Number!");
		
	
		imageButton.setText("Random Picture!");
		
		
		setupNumber();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private int setupNumber()
	{
		int number = (int)(Math.random()*30000);
		return number;
		
	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				setBackground(InterfaceController.colorArray());
				colorButton.setBackground(InterfaceController.colorArray());
				
			}
			
		});
		imageButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/"+InterfaceController.imageArray())));
				
			}
			
		});
		numberButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent click)
			{
				numberButton.setText("Random Number! "+setupNumber());
				
			}
			
		});
		randomButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent click)
			{
				numberButton.setText("Random Number! "+setupNumber());
				label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/"+InterfaceController.imageArray())));
				setBackground(InterfaceController.colorArray());
				colorButton.setBackground(InterfaceController.colorArray());
			}
			
		});
		
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, colorButton, 36, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, 63, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, label, 96, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, label, -10, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.WEST, imageButton, 68, SpringLayout.EAST, numberButton);
		baseLayout.putConstraint(SpringLayout.NORTH, numberButton, 0, SpringLayout.NORTH, colorButton);
		baseLayout.putConstraint(SpringLayout.WEST, numberButton, 101, SpringLayout.EAST, colorButton);	
	}

	private void setupPanel()
	{
		setLayout(baseLayout);
		add(colorButton);
		add(imageButton);
		add(label);
		add(numberButton);
		add(randomButton);
		setVisible(true);
		
	}
}

package Interface.controller;

import java.awt.Color;

import Inferface.view.InterfaceFrame;

public class InterfaceController
{
	private InterfaceFrame baseFrame;
	public static Color colorArray;
	private Color[] colors;
	private static int randomNumber;
	private static Color randomizedColor;
	private static String randomImage;
	public static String imagesArray;
	
	
	public InterfaceController()
	{
		baseFrame = new InterfaceFrame(this);
		
	}
	public static Color colorArray()
	{
		randomNumber = (int)(Math.random()* 7);
		if(randomNumber == 1)
			randomizedColor = Color.red;
		else if (randomNumber == 2)
			randomizedColor = Color.orange;
		else if (randomNumber == 3)
			randomizedColor = Color.yellow;
		else if (randomNumber == 4)
			randomizedColor = Color.green;
		else if (randomNumber == 5)
			randomizedColor = Color.blue;
		else if (randomNumber == 6)
			randomizedColor = Color.cyan;
		else if (randomNumber == 7)
			randomizedColor = Color.magenta;
		else if (randomNumber == 0)
			randomizedColor = Color.pink;
		return randomizedColor;
	}
	public static String imageArray()
	{
		
		randomNumber = (int)(Math.random()* 8);
		if(randomNumber == 0)
			randomNumber = (int)(Math.random()* 8);
		else if(randomNumber == 1)
			randomImage = "mlg.gif";
		else if(randomNumber == 2)
			randomImage = "mlg.png";
		else if (randomNumber == 3)
			randomImage = "ohbabyatriple.jpg";
		else if(randomNumber == 4)
			randomImage = "sanic.gif";
		else if(randomNumber == 5)
			randomImage = "snoop.gif";
		else if(randomNumber == 6)
			randomImage = "doge.gif";
		else if(randomNumber == 7)
			randomImage = "chicken.gif";
		
		return randomImage;
	}
	public void start()
	{
		
	}
}

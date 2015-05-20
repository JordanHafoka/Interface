package Inferface.view;

import javax.swing.JFrame;

import Interface.controller.InterfaceController;

public class InterfaceFrame extends JFrame
{
	private InterfaceController baseController;
	private InterfacePanel basePanel;
	
	public InterfaceFrame(InterfaceController baseController)
	{
		this.baseController = baseController;
		basePanel = new InterfacePanel();
		
		setupFrame();
	}

	private void setupFrame()
	{
		setContentPane(basePanel);
		setSize(900,900);
		setVisible(true);
		
	}
}

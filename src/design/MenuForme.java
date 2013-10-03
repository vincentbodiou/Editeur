package design;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Forme.CreateDessin;
import Forme.CreateEllipse;
import Forme.CreateRectangle;


public class MenuForme extends JPanel{

	private static final long serialVersionUID = 1L;
	private ButtonGroup buttonGroup=new ButtonGroup();
	private JRadioButton buttonEllipse = new JRadioButton("Ellipse");
	private JRadioButton buttonRect = new JRadioButton("Rectangle");
	private ZoneDeDessin zone;
	private GridLayout gridLayout;
	private JPanel panelButton;
	
	
	 public MenuForme(ZoneDeDessin zone)
	 {
		this.zone=zone;
				
		setBackground(Color.gray);
		setSize(150, 800);
		setLocation(0,0);
		buttonGroup.add(buttonRect);
		buttonGroup.add(buttonEllipse);		 
		 	 
		panelButton=new JPanel();
		gridLayout = new GridLayout(2,1);
		panelButton.setLayout(gridLayout);
			
		panelButton.add(buttonRect);
		panelButton.add(buttonEllipse);
		add(panelButton);
		 		 
		buttonRect.addActionListener(new FormListener(zone, new CreateRectangle()));
		buttonEllipse.addActionListener(new FormListener(zone, new CreateEllipse()));
	 }
	 
	 class FormListener implements ActionListener
	 {
		 private ZoneDeDessin zone;
		 private CreateDessin createDessin;		 
		 
		 public FormListener(ZoneDeDessin zone,CreateDessin createDessinn)
		 {
			 this.zone=zone;
			 createDessin=createDessinn;
		 }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			zone.setCreateDessin(createDessin);			
		}	
		 
	 }
	 
	
	
}

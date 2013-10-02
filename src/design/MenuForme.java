package design;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Forme.CreateDessin;
import Forme.CreateEllipse;
import Forme.CreateRectangle;


public class MenuForme extends JPanel{

	private static final long serialVersionUID = 1L;
	ButtonGroup buttonGroup=new ButtonGroup();
	JRadioButton buttonEllipse = new JRadioButton("Ellipse");
	JRadioButton buttonRect = new JRadioButton("Rectangle");
	ZoneDeDessin zone;
	GridLayout gridLayout;
	JPanel panelButton;
	
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
		 
		 
		 public FormListener(ZoneDeDessin zone,CreateDessin createDessin)
		 {
			 this.zone=zone;
			 this.createDessin=createDessin;
		 }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			zone.setCreateDessin(createDessin);
		}
		 
	 }
}

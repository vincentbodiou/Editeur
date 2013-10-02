package design;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;


public class MenuCouleur extends JPanel{

	private static final long serialVersionUID = 1L;
	JCheckBox bleue = new JCheckBox("Bleue");
	JCheckBox jaune = new JCheckBox("Jaune");
	JCheckBox blanc = new JCheckBox("Blanc");
	JCheckBox vert = new JCheckBox("Vert");
	ButtonGroup buttonGroup=new ButtonGroup();
	ZoneDeDessin zone;
	JPanel panelButton;
	GridLayout gridLayout;
	Apercu apercu;
	
	public MenuCouleur(ZoneDeDessin zone)
	{
		this.zone = zone;
		
		apercu = new Apercu();
		
		
		buttonGroup.add(bleue);
		buttonGroup.add(jaune);
		buttonGroup.add(blanc);
		buttonGroup.add(vert);
		setBackground(Color.gray);
		setSize(150, 800);
		setLocation(800,0);
		panelButton=new JPanel();
		gridLayout = new GridLayout(4,1);
		panelButton.setLayout(gridLayout);		
		panelButton.add(blanc);
		panelButton.add(bleue);
		panelButton.add(vert);
		panelButton.add(jaune);
		
		bleue.addActionListener(new CouleurListener(zone, Color.blue));
		blanc.addActionListener(new CouleurListener(zone, Color.white));
		vert.addActionListener(new CouleurListener(zone, Color.green));
		jaune.addActionListener(new CouleurListener(zone, Color.yellow));
		
		setLayout(new BorderLayout());		
		add(BorderLayout.NORTH,panelButton);
		add(BorderLayout.SOUTH, apercu);
		
		
	}
	
	class CouleurListener implements ActionListener
	{
		private ZoneDeDessin zone;
		private Color couleur;
	

		public CouleurListener(ZoneDeDessin zone, Color couleur) {
			this.zone=zone;
			this.couleur=couleur;
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			zone.setBackground(couleur);
		}
	}

}

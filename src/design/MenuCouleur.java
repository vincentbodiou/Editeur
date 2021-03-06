package design;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;


public class MenuCouleur extends JPanel{

	private static final long serialVersionUID = 1L;
	private JCheckBox bleue = new JCheckBox("Bleue");
	private JCheckBox jaune = new JCheckBox("Jaune");
	private JCheckBox blanc = new JCheckBox("Blanc");
	private JCheckBox vert = new JCheckBox("Vert");
	private ButtonGroup buttonGroup=new ButtonGroup();
	private ZoneDeDessin zone;
	private JPanel panelButton;
	private GridLayout gridLayout;
	private Apercu apercu;
	
	public MenuCouleur(ZoneDeDessin zone, MenuForme menuForme)
	{
		this.zone = zone;
		apercu = new Apercu();
		zone.addPropertyChangeListener("foreground", apercu);
		zone.addPropertyChangeListener("forme", apercu);
		
		
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
			zone.setForegroundColor(couleur);			
			
		}
	}

}

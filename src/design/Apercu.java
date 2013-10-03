package design;

import java.awt.Color;

import javax.swing.JPanel;

import Forme.CreateDessin;
import Forme.Dessin;

public class Apercu extends JPanel implements Observateur{

	private static final long serialVersionUID = 1L;
	private ZoneDeDessin zone;
	
	public Apercu(ZoneDeDessin zone)
	{
		this.zone=zone;		
		this.zone.ajouterObservateur(this);
			
		setBackground(Color.cyan);
	}

	@Override
	public void actualiser() {
		setBackground(zone.getBackground());		
	}

	
	
}

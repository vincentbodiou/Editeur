package design;

import java.awt.Color;

import javax.swing.JPanel;

import Forme.CreateDessin;
import Forme.Dessin;

public class Apercu extends JPanel implements Observateur{

	private static final long serialVersionUID = 1L;
	private JPanel zoneApercu;
	private ZoneDeDessin zone;
	private MenuForme menuForme;
	private Dessin dessin;
	
	
	public Apercu(ZoneDeDessin zone, MenuForme menuForme)
	{
		this.zone=zone;
		this.menuForme=menuForme;
		this.zone.ajouterObservateur(this);
		
		
		setBackground(Color.cyan);
	}

	@Override
	public void actualiser() {
		setBackground(zone.getBackground());		
	}

	@Override
	public void actualiserForme(CreateDessin createDessin) {
		createDessin.creerDessin();		
	}

	
}

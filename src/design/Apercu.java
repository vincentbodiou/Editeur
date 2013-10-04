package design;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

import Forme.CreateDessin;
import Forme.Dessin;

public class Apercu extends JPanel implements PropertyChangeListener{

	private static final long serialVersionUID = 1L;
	private CreateDessin createDessin;
	private Color couleur;
	private Dessin dessin;
	
	public Apercu()
	{				
		setBackground(Color.cyan);
		setSize(100, 100);
		setPreferredSize(getSize());
		setLayout(null);
	}

	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if(e.getPropertyName().equals("forme")) {
			createDessin = (CreateDessin)e.getNewValue();
			
		}
		else if(e.getPropertyName().equals("foreground"))
			couleur = (Color)e.getNewValue();
		
		if(createDessin!=null) {
			if(dessin!=null)
				remove(dessin);
			
		dessin = createDessin.creerDessin();
		dessin.setSize(80, 80);
		dessin.setPreferredSize(dessin.getSize());
		dessin.setForeground(couleur);
		dessin.setBounds((int)(0.2*getWidth()), (int)(0.2*getHeight()), (int)(0.6*getWidth()), (int)(0.6*getHeight()));
		add(dessin);
		repaint();		
		}
		
	}

}

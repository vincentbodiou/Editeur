package design;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

class Fermeur extends WindowAdapter {

	   public void windowClosing (WindowEvent e) {
	      System.exit (0) ;
	   }

}


public class Editeur extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ZoneDeDessin zoneDessin;
	private MenuCouleur menuCouleur;
	
	
	public Editeur()
	{
		super();
		
		setTitle("Editeur");
		setSize(800, 600);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//setResizable(false);
		
		addWindowListener (new Fermeur ());
		zoneDessin = new ZoneDeDessin(); 
		menuCouleur = new MenuCouleur(zoneDessin);
		
		getContentPane().add(BorderLayout.CENTER, zoneDessin);
		getContentPane().add(BorderLayout.WEST, new MenuForme(zoneDessin));
		getContentPane().add(BorderLayout.EAST, menuCouleur);
				
		setVisible(true);
	}
	
	
	public static void main (String args []) {
	     new Editeur ();
	}
	
}

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class Fermeur extends WindowAdapter {

	   public void windowClosing (WindowEvent e) {
	      System.exit (0) ;
	   }

}


public class Editeur extends JFrame{

	private ZoneDeDessin zoneDessin;
	
	
	public Editeur()
	{
		super();
		
		setTitle("Editeur");
		setSize(800, 600);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		addWindowListener (new Fermeur ()) ;
		zoneDessin = new ZoneDeDessin(); 
		setContentPane(zoneDessin);
		
		setVisible(true);
	}
	
	
	public static void main (String args []) {
	     new Editeur ();
	}
	
}

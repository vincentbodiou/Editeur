package Forme;
import java.awt.Color;
import java.awt.Graphics;


public class Ellipse extends Dessin{

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
		g.fillOval(0,0,getWidth()-1, getHeight()-1);		
	}
	
	
}

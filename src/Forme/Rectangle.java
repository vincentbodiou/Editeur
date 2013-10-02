package Forme;
import java.awt.Graphics;


public class Rectangle extends Dessin {

	private static final long serialVersionUID = 1L;

	public Rectangle() {
		
	}
	
	public void paint(Graphics g)
	{
		g.drawRect(0,0,getWidth()-1, getHeight()-1);		
	}
}

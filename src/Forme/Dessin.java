package Forme;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public abstract class Dessin extends JPanel{

	private static final long serialVersionUID = 1L;
	private int x1,y1;
	
	public Dessin() {
		// TODO Auto-generated constructor stub
		setBackground(null);
		DessinListener listener = new DessinListener();
		setBackground(Color.black);
		addMouseListener(listener);	
		addMouseMotionListener(listener);		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);		
	}
	
	class DessinListener implements MouseListener, MouseMotionListener
	{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			x1 = arg0.getX();
			y1 = arg0.getY();
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			int dx = arg0.getX()-x1;
			int dy = arg0.getY()-y1;
			setLocation(getX()+dx, getY()+ dy);
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

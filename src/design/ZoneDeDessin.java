package design;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import Forme.CreateDessin;
import Forme.Dessin;


public class ZoneDeDessin extends JPanel {

	private static final long serialVersionUID = 1L;
	private int x1,x2,y1,y2;
	private Dessin dessin;
	private CreateDessin createDessin;

	public ZoneDeDessin() {		
		setBackground(Color.white);
		FormListener listener = new FormListener();
		addMouseListener(listener);	
		addMouseMotionListener(listener);
		setLayout(null);
	}
	
	public void setCreateDessin(CreateDessin cd)
	{
		createDessin=cd;
	}
		
	
	class FormListener implements MouseListener, MouseMotionListener
	{	
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			x1 = e.getX();
			y1 = e.getY();
			dessin = createDessin.creerDessin();
			add(dessin,0);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			x2 = e.getX();
			y2 = e.getY();
			dessin.setBounds(Math.min(x1, x2), Math.min(y2, y1), Math.abs(x1-x2), Math.abs(y1-y2));
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
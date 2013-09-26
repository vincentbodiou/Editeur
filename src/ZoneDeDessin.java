import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;


public class ZoneDeDessin extends JPanel {

	private static final long serialVersionUID = 1L;
	private int x1,x2,y1,y2;
	private Dessin dessin;

	public ZoneDeDessin() {		
		setBackground(Color.white);
		FormListener listener = new FormListener(this);
		addMouseListener(listener);	
		addMouseMotionListener(listener);
	}
		
	
	class FormListener implements MouseListener, MouseMotionListener
	{
		private ZoneDeDessin zoneDeDessin;
		
		
		protected FormListener(ZoneDeDessin zone)
		{
			this.zoneDeDessin=zone;
		}
		
		
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
			dessin = new Dessin();
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
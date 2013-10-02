package Forme;

public class CreateEllipse implements CreateDessin{

	@Override
	public Dessin creerDessin() {
		return new Ellipse();
		}

}

package Forme;

public class CreateRectangle implements CreateDessin{

	@Override
	public Dessin creerDessin() {
		return new Rectangle();		
	}

}

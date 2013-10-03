package design;

import Forme.CreateDessin;

public interface Observateur {
	void actualiser();
	void actualiserForme(CreateDessin createDessin);
}

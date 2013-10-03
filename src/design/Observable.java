package design;

public interface Observable {

	void ajouterObservateur(Observateur o);
	void supprimerObservateur(Observateur o);
	void notifierObservateur();
}

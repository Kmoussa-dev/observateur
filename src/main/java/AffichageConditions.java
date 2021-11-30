public class AffichageConditions implements Observateur,Affichage{
    private float temperature;
    private float humidite;
    private Sujet donneesMeteo;

    public AffichageConditions(Sujet donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void afficher() {
        System.out.println("Condition actuelles: "+ temperature+" degrés C et "+humidite+"% d'humidité");
    }

    @Override
    public void actualiser(float temperature, float humidite, float pression) {
        this.temperature=temperature;
        this.humidite=humidite;
        afficher();
    }

}

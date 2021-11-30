import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Sujet{
    private List<Observateur> observateurs;
    private float temperature;
    private float humidite;
    private float pression;

    public DonneesMeteo(){
        observateurs=new ArrayList<Observateur>();
    }
    @Override
    public void enregistrerObservateur(Observateur o) {
        observateurs.add(o);
    }

    @Override
    public void supprimerObservateur(Observateur o) {
        observateurs.remove(o);
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur o:observateurs){
            o.actualiser(temperature,humidite,pression);
        }
    }
    public void actualiserMesures(){
        notifierObservateurs();
    }
}

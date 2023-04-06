package MiniBanque;

import java.util.UUID;

public class Compte {
     private UUID iban;
    private float solde;


    public Compte() {

    }

    public UUID genererIban(){
        this.iban = UUID.randomUUID();
        return this.iban;
    }

    public void depot(float valeur){
        System.out.println("Vous avez déposez "+ valeur+ " Euros.");
    }
    public void retrait(float valeur){
        System.out.println("Vous avez effectuez un retrait de "+valeur+" Euros.");
    }
    public float getSolde(){
        return this.solde;
    }
    public void afficherSolde(){
        System.out.println("Le solde du compte numéro "+this.iban+" est de "+ this.solde+" Eurs.");
    }
    public void virer(float valeur, Compte destinataire){
        destinataire.solde += valeur;
        System.out.println("Votre virement vers le compte "+destinataire.iban+" a été effectuer avec succès.");
    }

}

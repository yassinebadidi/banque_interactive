package MiniBanque;

import java.util.UUID;

public class Client {
    private final String nom;
    private final Compte[] comptes = new Compte[100];
    private int nbComptes;

    public Client(String nomClient){
        this.nom = nomClient;
    }

    public String getNom() {
        return this.nom;
    }
    public int getNbComptes(){
        return this.nbComptes;
    }
    public float getSolde(){
        float somme = 0;
        for(int i = 0;i<nbComptes;i++){
            somme += this.comptes[i].getSolde();
        }
        return somme;
    }

    public void afficherSolde(){
        System.out.println("Le solde de "+this.nom+" est : "+this.getSolde()+" Euros.");
    }

    public void compteCourant(){
        this.comptes[0] = new Compte();
        UUID iban = comptes[0].genererIban();
        this.nbComptes ++;
        System.out.println("Le compte de "+ this.nom +" a été ajouter avec succès.");
        System.out.println("Son IBAN est :"+ iban);
    }

    public void ajouterCompte(){
        for(int i =1;i< comptes.length;i++){
            if(this.comptes[i] == null){
                this.comptes[i] = new Compte();
                UUID iban = comptes[i].genererIban();
                this.nbComptes ++;
                System.out.println("Le compte "+i+" de "+ this.nom +" a été ajouter avec succès.");
                System.out.println("Votre IBAN est :"+ iban);
                break;
            }
        }
    }

}

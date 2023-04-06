package MiniBanque;

import java.util.Scanner;

public class BanqueIneractive {

    public Banque maBanque;
    public BanqueIneractive(Banque maBanque){
        this.maBanque = maBanque;
    }


    public void menuGenerale(){
        System.out.println("Quele opération voulez-vous effectuer?");
        System.out.println("1) Ajouter un client");
        System.out.println("2) Effectuer une opération sur un client");
        System.out.println("3) Afficher le bilan générale.");
        System.out.print("- ");
    }
    public void interactionGeneral1(int reponse){
        if (reponse == 1){
            this.maBanque.ajouterClient();
        } else if (reponse == 2) {
            System.out.println("Quel client ?");
            this.maBanque.afficherClients();
        } else if (reponse == 3) {
            this.maBanque.afficherBilan();
        }
    }

    public String demandeNomClient(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Entrer le nom du client :");
        System.out.print("- ");
        String nom = scanner.next();
        scanner.close();
        return nom;
    }


}

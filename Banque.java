package MiniBanque;

public class Banque {

    // Attributs :
    private String nom;
    private final Client[] clients = new Client[100];

    // Constructeurs
    public Banque(){
    }

    //Methods
    public void setNomBanque(String nom){
        this.nom = nom;
    }
    private final BanqueIneractive maBanqueInteractive = new BanqueIneractive(this);
    public void ajouterClient(){
        for(int i=0;i< this.clients.length;i++){
            if(this.clients[i] == null){
                String nomClient = maBanqueInteractive.demandeNomClient();
                this.clients[i] = new Client(nomClient);
               this.clients[i].compteCourant();
                System.out.println("Bienvenu "+ this.clients[i].getNom() +" chez " + this.nom + ".");
                break;
            }
        }
    }

    public int nbClient(){
        int count = 0;
        for (Client client : clients) {
            if (client == null) {
                return count;
            }
            count++;
        }
        return count;
    }

    public void bilanClient(Client client){
        System.out.println("----> "+client.getNom() +", possède " + client.getNbComptes()
                + " Comptes, avec une somme de "+ client.getSolde());
    }


    public void afficherBilan(){
        System.out.println("La banque "+ this.nom+" a"+ this.nbClient() + "clients.");
        for(int i = 0;i<this.nbClient();i++){
            System.out.println("--------------------------");
            System.out.println("Client "+i+" : ");
            this.bilanClient(this.clients[i]);
        }
    }

    public void afficherClients(){
        for(int i = 0;i<this.nbClient();i++){
            System.out.println((i+1)+") "+ this.clients[i].getNom());
        }
    }
}

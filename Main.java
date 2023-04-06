package MiniBanque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Donnez le nom de votre banque :");
        Scanner scanner = new Scanner(System.in);

        String NomBanque = scanner.next();

        // Declaration et nommage de ma banque :
        Banque maBanque = new Banque();
        maBanque.setNomBanque(NomBanque);

        // Appelle de la banque interactive :
        BanqueIneractive maBanqueInteractive = new BanqueIneractive(maBanque);

        maBanqueInteractive.menuGenerale();
        int reponse = scanner.nextInt();
        maBanqueInteractive.interactionGeneral1(reponse);

    }

}
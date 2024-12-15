package ws;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println("============================WEB SERVICE APPLICATION============================");
        System.out.println("Convert 11€ to Dirham :");
        System.out.println("11 € = "+proxy.conversionEuroToDH(11 )+" DH");
        System.out.println("************** Compte Recherché ************** ");
        Compte c = proxy.getCompte(4);
        System.out.println("Code = "+c.getCode());
        System.out.println("Solde = "+c.getSolde());
        System.out.println("Date de Création = "+c.getDateCreation());
        List<Compte> listeComptes = proxy.getAll();
        System.out.println("************** liste des comptes **************");

        for (Compte cp : listeComptes){
            System.out.println("-----------Compte "+cp.getCode()+"-------------");
            System.out.println("Code = "+cp.getCode());
            System.out.println("Solde = "+cp.getSolde());
            System.out.println("Date de Création = "+cp.getDateCreation());
        }
    }
}

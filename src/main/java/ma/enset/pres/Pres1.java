package ma.enset.pres;

import ma.enset.dao.DaoImpl;
import ma.enset.ext.DaoImplV2;
import ma.enset.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d); // injection des dépendances via le setter
        System.out.println("resultat = "+ metier.calcul());
    }
}

package ma.enset.pres;

import ma.enset.dao.DaoImpl;
import ma.enset.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d); // injection des dépendances via le setter
        System.out.println("resultat = "+ metier.calcul());
    }
}

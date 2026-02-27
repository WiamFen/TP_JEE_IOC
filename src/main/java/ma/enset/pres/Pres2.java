package ma.enset.pres;

import ma.enset.dao.IDao;
import ma.enset.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao d = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);

        // via constructeur avec paramètres
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(d);

        //via setter
        //IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
        //Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        //setDao.invoke(metier,d);

        System.out.println("resultat = "+ metier.calcul());
    }
}

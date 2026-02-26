package ma.enset.metier;

import ma.enset.dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao; //couplage faible

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    public IMetierImpl() {
    }

    @Override
    public double calcul() {
        double t=dao.getData();
        double res = t * 12 * Math.PI/2 * Math.cos(t);
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

package metier;

import dao.IDao;

public class MetierImpl implements Imetier {

	private IDao dao;
	
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public double calcul() {
		// TODO Auto-generated method stub
		double nb = dao.getValue();
		return nb*6;
	}

}

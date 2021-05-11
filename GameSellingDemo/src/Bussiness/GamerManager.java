package Bussiness;

import DataAccess.IGamerDal;
import Entity.Gamer;

public class GamerManager implements IGamerService {
	IGamerDal gamerDal;

	public GamerManager(IGamerDal gamerDal) {
		
		this.gamerDal = gamerDal;
	}

	@Override
	public void add(Gamer gamer) {
		gamerDal.add(gamer);
		
	}

	@Override
	public void delete(Gamer gamer) {
		gamerDal.delete(gamer);
		
	}

	@Override
	public void update(Gamer gamer) {
		gamerDal.update(gamer);
		
	}

}

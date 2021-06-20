package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class MyCheckManager implements GamerCheckService{

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		
		if (gamer.getNationalityId().length() == 11) {
			return true;
		}
		return false;
	}

}

package Concrete;

import Abstract.SaleService;
import Entities.Game;
import Entities.Gamer;


public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " bought game " + game.getGameName());
		
	}

}

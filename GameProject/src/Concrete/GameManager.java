package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void gameAdd(Game game) {
		
		System.out.println("Game " + game.getGameName() + " added.");
		
	}

	@Override
	public void gameDelete(Game game) {
		
		System.out.println("Game " + game.getGameName() + " deleted.");
		
	}

	@Override
	public void gameUpdate(Game game) {
		
		System.out.println("Game " + game.getGameName() + " updated.");
		
	}

}

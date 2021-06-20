package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;
	
	

	public GamerManager(Abstract.GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void gamerAdd(Gamer gamer) {
		
		if (this.gamerCheckService.CheckIfRealGamer(gamer)) {
			
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " user added.");
			
		}else {
			
			System.out.println("Not a valid person");
		}
		
		
		
	}

	@Override
	public void gamerDelete(Gamer gamer) {
		
		if (this.gamerCheckService.CheckIfRealGamer(gamer)) {
			
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " user has been deleted.");
			
		}else {
			
			System.out.println("Not a valid person");
		}
		
		
	}

	@Override
	public void gamerUpdate(Gamer gamer) {
		
		if (this.gamerCheckService.CheckIfRealGamer(gamer)) {
		
			System.out.println("User " + gamer.getFirstName() + " " + gamer.getLastName() + " updated.");
			
		}else {
			
			System.out.println("Not a valid person");
		}
		
	}
	
	

}

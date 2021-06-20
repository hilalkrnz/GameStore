package GameProject;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.MyCheckManager;
import Concrete.SaleManager;
import Concrete.SummerCampaignManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer(1, "Hilal", "Kurnaz", LocalDate.of(2001, 07, 14), "12345678910");
		Gamer gamer2 = new Gamer(2, "Ahmet", "Demir", LocalDate.of(1995, 02, 10), "12345678911");
		
		Game game1 = new Game(1, "The Witcher 3", 30);
		Game game2 = new Game(2, "GTA 5", 150);
		
		Campaign campaign1 = new Campaign(1, "SummerCampaign", 10 , LocalDate.of(2021, 06, 05), LocalDate.of(2021, 06, 12), 7);
		
		GamerManager gamerManager = new GamerManager(new MyCheckManager());
		gamerManager.gamerAdd(gamer1);
		gamerManager.gamerUpdate(gamer1);
		gamerManager.gamerDelete(gamer2);
		
		GameManager gameManager = new GameManager();
		gameManager.gameAdd(game1);
		gameManager.gameAdd(game2);
		gameManager.gameUpdate(game2);
		gameManager.gameDelete(game1);
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer1, game1);
		saleManager.sale(gamer1, game2);
		
		SummerCampaignManager summerCampaignManager = new SummerCampaignManager();
		summerCampaignManager.campaignAdd(game1, campaign1);
		summerCampaignManager.campaignAdd(game2, campaign1);
		summerCampaignManager.campaignDelete(campaign1);

	}

}

package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		try {
			
			return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()),
					gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth().getYear());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
	

}
